package com.defence.mahdee.autistant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContactUsFragment extends Fragment {

TextView tv;

public ContactUsFragment(){
}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
View view =inflater.inflate(R.layout.fragment_contact_us,container,false);

tv = view.findViewById(R.id.contactUsTV2);

tv.setText("If you have any suggestion or want to give any feedback for the developer of the app, then please let us know. Your opinion is very important to us.\n" +
        "Email: abdullah.al.mahdee@gmail.com\n" +
        "Phone: 01824605670\n" +
        "Email: raisul2010.5369@gmail.com\n" +
        "Phone: 01937074334");
        return view;
    }
}
