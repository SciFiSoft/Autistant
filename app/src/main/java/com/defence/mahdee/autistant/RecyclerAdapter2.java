package com.defence.mahdee.autistant;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter2 extends RecyclerView.Adapter<RecyclerAdapter2.MyViewHolder> {

    private List<String> list1,list2,list3,list4;
    private int c;

    public RecyclerAdapter2(List<String> list1,List<String> list2,List<String> list3,List<String> list4, int c){
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
        this.list4 = list4;
        this.c = c;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.itemName.setText(list1.get(position));
        holder.itemAddress.setText(list4.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DoctorDetailsFragment detailsFragment = new DoctorDetailsFragment();
                detailsFragment.setS1(list1.get(position));
                detailsFragment.setS2(list2.get(position));
                detailsFragment.setS3(list3.get(position));
                detailsFragment.setS4("");
                detailsFragment.setS5("");
                detailsFragment.setS6("");
                detailsFragment.setIm(Integer.toString(position+1));
                detailsFragment.setC(c);
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragmentContainer,detailsFragment).addToBackStack(null).commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list1.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView itemName,itemAddress;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemName = itemView.findViewById(R.id.item_name);
            itemAddress = itemView.findViewById(R.id.item_address);
        }
    }
}
