package com.example.a27novandroid;

import android.view.LayoutInflater;


import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Recyclerviewexample extends RecyclerView.Adapter<Recyclerviewexample.DemoViewHolder> {

    public List<Country> countryList;

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.demo_row,parent, false);
        return new DemoViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, int position) {
        Country mCountry = countryList.get(position);
        holder.title.setText(mCountry.getTitle());
        holder.imgFlag.setImageResource(mCountry.getFlag());



    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }

    public class DemoViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgFlag;
        public TextView title;
        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFlag=itemView.findViewById(R.id.imgFlag);
            title=itemView.findViewById(R.id.title);
        }

    }
    public Recyclerviewexample(List<Country>countryList){

        this.countryList= countryList;
    }
}

