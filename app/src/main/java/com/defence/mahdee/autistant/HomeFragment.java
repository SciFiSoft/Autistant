package com.defence.mahdee.autistant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class HomeFragment extends Fragment {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn11,btn12,btn13;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);

        FragmentManager fm = MainActivity.fragmentManager;
        for(int i = 0; i < fm.getBackStackEntryCount(); ++i) {
            fm.popBackStack();
        }

        btn1 = view.findViewById(R.id.btn_Cardiologists);
        btn2 = view.findViewById(R.id.btn_Dermatologists);
        btn3 = view.findViewById(R.id.btn_Nephrologists);
        btn4 = view.findViewById(R.id.btn_Neurologists);
        btn5 = view.findViewById(R.id.btn_Medicine);
        btn6 = view.findViewById(R.id.btn_Orthopedics);
        btn7 = view.findViewById(R.id.btn_Urologists);
        btn8 = view.findViewById(R.id.btn_Dentists);
        btn9 = view.findViewById(R.id.btn_ENT);
        btn11 = view.findViewById(R.id.btn_Vision);
        btn12 = view.findViewById(R.id.btn_Pedi);
        btn13 = view.findViewById(R.id.btn_Dietitian);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(3);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(4);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(5);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(6);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(7);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(8);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(9);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(10);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(11);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(13);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(14);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });

        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SpecialistFragment specialistFragment = new SpecialistFragment();
                specialistFragment.setTxtString(15);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,specialistFragment).addToBackStack(null).commit();
            }
        });


        return view;
    }

}
