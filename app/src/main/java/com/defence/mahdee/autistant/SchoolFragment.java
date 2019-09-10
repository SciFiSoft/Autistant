package com.defence.mahdee.autistant;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SchoolFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private List<String> list1,list2,list3,list4;
    private RecyclerAdapter2 adapter;


    public SchoolFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_school, container, false);

        FragmentManager fm = MainActivity.fragmentManager;
        for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }

        recyclerView = view.findViewById(R.id.recycle3);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();


        readdata();

        return view;
    }

    private void readdata(){

        SqliteDbHelper contactDbHelper = new SqliteDbHelper(getActivity());
        SQLiteDatabase database = contactDbHelper.getReadableDatabase();

        Cursor cursor = contactDbHelper.readSchool(database);


        while (cursor.moveToNext()){
            String name = cursor.getString(cursor.getColumnIndex("name"));
            String address = cursor.getString(cursor.getColumnIndex("address"));
            String contact = cursor.getString(cursor.getColumnIndex("contact"));
            String loc = cursor.getString(cursor.getColumnIndex("loc"));

            list1.add(name);
            list2.add(address);
            list3.add(contact);
            list4.add(loc);

        }
        adapter = new RecyclerAdapter2(list1,list2,list3,list4,2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        contactDbHelper.close();
    }

}
