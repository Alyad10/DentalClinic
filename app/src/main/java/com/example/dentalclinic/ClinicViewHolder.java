package com.example.dentalclinic;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ClinicViewHolder extends RecyclerView.ViewHolder {
    private TextView tv_clinic;
    public ClinicViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_clinic =itemView.findViewById(R.id.tv_clinic);

    }
    void bind(String clinics){
        tv_clinic.setText(clinics);


    }
}
