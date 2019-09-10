package com.defence.mahdee.autistant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class AboutUsFragment extends Fragment {

    TextView tv1, tv2;

    public AboutUsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view = inflater.inflate(R.layout.fragment_about_us, container, false);

tv1 = view.findViewById(R.id.aboutUsTV2);
tv2 = view.findViewById(R.id.aboutAppTV2);

tv1.setText("Autistant is dedicated for promoting solutions, across the spectrum and throughout the life span, for the needs of individuals with autism and their families through advocacy and support; increasing understanding and acceptance of people with autism spectrum disorder; and advancing research into causes and better interventions for autism spectrum disorder and related conditions.\n" +
        "\n" +
        "Autistant enhances lives today and is accelerating a spectrum of solutions for tomorrow.");

tv2.setText("In this application information about all the specialists of Bangladesh who can give treatment to autistic child is gathered. Information about hospitals and schools are also given in details. ");
        return view;
    }
}
