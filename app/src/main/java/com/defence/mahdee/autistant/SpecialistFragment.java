package com.defence.mahdee.autistant;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SpecialistFragment extends Fragment {

    int txtString;
    //TextView txtDisplay;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> list1,list2,list3,list4,list5,list6;
    private RecyclerAdapter1 adapter;


    public SpecialistFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_specialist, container, false);

        //txtDisplay = view.findViewById(R.id.txt_spl);
        recyclerView = view.findViewById(R.id.recycle1);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();
        list5 = new ArrayList<>();
        list6 = new ArrayList<>();


        SqliteDbHelper contactDbHelper = new SqliteDbHelper(getActivity());
        SQLiteDatabase database = contactDbHelper.getReadableDatabase();

        int f=txtString;
        if(f==3){
            Cursor cursor = contactDbHelper.readCardio(database);
            readdata(cursor,f);
        }
        else if(f==4){
            Cursor cursor = contactDbHelper.readDermato(database);
            readdata(cursor,f);
        }
        else if(f==5){
            Cursor cursor = contactDbHelper.readNephro(database);
            readdata(cursor,f);
        }
        else if(f==6){
            Cursor cursor = contactDbHelper.readNeuro(database);
            readdata(cursor,f);
        }
        else if(f==7){
            Cursor cursor = contactDbHelper.readMedicine(database);
            readdata(cursor,f);
        }
        else if(f==8){
            Cursor cursor = contactDbHelper.readOrtho(database);
            readdata(cursor,f);
        }
        else if(f==9){
            Cursor cursor = contactDbHelper.readUro(database);
            readdata(cursor,f);
        }
        else if(f==10){
            Cursor cursor = contactDbHelper.readDentists(database);
            readdata(cursor,f);
        }
        else if(f==11){
            Cursor cursor = contactDbHelper.readEnt(database);
            readdata(cursor,f);
        }
        else if(f==12){
            Cursor cursor = contactDbHelper.readSpeech(database);
            readdata(cursor,f);
        }
        else if(f==13){
            Cursor cursor = contactDbHelper.readVision(database);
            readdata(cursor,f);
        }
        else if(f==14){
            Cursor cursor = contactDbHelper.readPedi(database);
            readdata(cursor,f);
        }
        else if(f==15){
            Cursor cursor = contactDbHelper.readDiet(database);
            readdata(cursor,f);
        }


        contactDbHelper.close();


        return view;
    }

    public void setTxtString(int txtString) {
        this.txtString = txtString;
    }

    private void readdata(Cursor cursor, int f){

        //String info = "";

        while (cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex("name"));
            String degree = cursor.getString(cursor.getColumnIndex("degree"));
            String contact = cursor.getString(cursor.getColumnIndex("contact"));
            String hospital = cursor.getString(cursor.getColumnIndex("hospital"));
            String chamber = cursor.getString(cursor.getColumnIndex("chamber"));

            list1.add(name);
            list3.add(degree);
            list4.add(hospital);
            list5.add(chamber);
            list6.add(contact);

            if(f==3){
                list2.add("Cardiologists");
            }
            else if(f==4){
                list2.add("Dermatologists");
            }
            else if(f==5){
                list2.add("Nephrologists");
            }
            else if(f==6){
                list2.add("Neurologists");
            }
            else if(f==7){
                list2.add("Medicine");
            }
            else if(f==8){
                list2.add("Orthopedics");
            }
            else if(f==9){
                list2.add("Urologists");
            }
            else if(f==10){
                list2.add("Dentists");
            }
            else if(f==11){
                list2.add("ENT");
            }
            else if(f==12){
                list2.add("Speech Therapists");
            }
            else if(f==13){
                list2.add("Vision");
            }
            else if(f==14){
                list2.add("Pedi Neurologists");
            }
            else if(f==15){
                list2.add("Dietitian");
            }



            //info += "\n\nName: "+name+"\nDegree: "+degree+"\nContact: "+contact+"\nHospital"+hospital;
        }
        adapter = new RecyclerAdapter1(list1,list2,list3,list4,list5,list6,f);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        //txtDisplay.setText("TextView");
    }
}
