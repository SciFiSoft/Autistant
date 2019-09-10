package com.defence.mahdee.autistant;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DoctorDetailsFragment extends Fragment {

    TextView tv1, tv2, tv3, tv4, tv5, tv6;
    Button btn1, btn2;
    ImageView img;
    String s1, s2, s3, s4, s5, s6, im;
    int c;

    public DoctorDetailsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_doctor_details, container, false);
        tv1 = view.findViewById(R.id.doc_name);
        tv2 = view.findViewById(R.id.doc_speciality);
        tv3 = view.findViewById(R.id.doc_degree);
        tv4 = view.findViewById(R.id.doc_contact);
        tv5 = view.findViewById(R.id.doc_chamber);
        tv6 = view.findViewById(R.id.doc_number);

        btn1 = view.findViewById(R.id.btn_route);
        btn2 = view.findViewById(R.id.btn_call);

        img = view.findViewById(R.id.docImage);

        String pic = "";
        if (c == 1) {
            pic = "h" + im;
        } else if (c == 2) {
            pic = "s" + im;
        } else if (c == 3) {
            pic = "c" + im;
        } else if (c == 4) {
            pic = "derm" + im;
        } else if (c == 5) {
            pic = "neph" + im;
        } else if (c == 6) {
            pic = "n" + im;
        } else if (c == 7) {
            pic = "m" + im;
        } else if (c == 8) {
            pic = "o" + im;
        } else if (c == 9) {
            pic = "u" + im;
        } else if (c == 10) {
            pic = "den" + im;
        } else if (c == 11) {
            pic = "e" + im;
        } else if (c == 12) {
            pic = "s" + im;
        } else if (c == 13) {
            pic = "v" + im;
        } else if (c == 14) {
            pic = "pn" + im;
        } else if (c == 15) {
            pic = "die" + im;
        }

        String uri = "@drawable/" + pic;

        try {
            int imageResource = getResources().getIdentifier(uri, null, getActivity().getPackageName());
            Drawable res = getResources().getDrawable(imageResource);
            img.setImageDrawable(res);
        } catch (Exception e) {
            Toast.makeText(getActivity(), "picture is not available", Toast.LENGTH_SHORT).show();
        }

        String sContact = "";
        String sTemp = "";
        if (c <= 2) {
            sContact = s3;
            tv1.setText(s1);
            sTemp = "Address: " + s2;
            tv2.setText(sTemp);
            sTemp = "Contact: " + s3;
            tv3.setText(sTemp);
            tv4.setText(s4);
            tv5.setText(s5);
            tv6.setText(s6);
        } else {
            sContact = s6;
            tv1.setText(s1);
            tv2.setText(s2);
            tv3.setText(s3);
            tv4.setText(s4);
            sTemp = "Chamber: " + s5;
            tv5.setText(sTemp);
            sTemp = "Contact: " + s6;
            tv6.setText(sTemp);
        }


        final String finalSContact = sContact;
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:" + finalSContact));
                startActivity(callIntent);
            }
        });

        String sRoute = "";
        if (c <= 2) {
            sRoute = s2;
        } else {
            sRoute = s5;
        }

        final String finalsRoute = sRoute;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + finalsRoute);
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    startActivity(mapIntent);
                } else {
                    Toast.makeText(getActivity(), "Google maps not found!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public void setS6(String s6) {
        this.s6 = s6;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public void setC(int c) {
        this.c = c;
    }
}




