package com.example.dentalclinic;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ClinicAdapter extends RecyclerView.Adapter<ClinicViewHolder> {
    ClinicAdapter(ArrayList<String> clinicsList) {
        this.clinicsList = clinicsList;

    }


    private ArrayList<String> clinicsList;




    @NonNull
    @Override
    public ClinicViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        return new ClinicViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dentists
                , parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClinicViewHolder holder, int position) {
        holder.bind(clinicsList.get(position));

    }

    @Override
    public int getItemCount() {
        return clinicsList.size();
    }
}
