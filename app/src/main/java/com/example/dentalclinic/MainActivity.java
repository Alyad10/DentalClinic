package com.example.dentalclinic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> clinicsList = new ArrayList<>();
    private ClinicAdapter clinicAdapter = new ClinicAdapter(clinicsList);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_clinics);
        recyclerView.setAdapter(clinicAdapter);

        loadData();
    }

    private void loadData() {
        clinicsList.add("Emmar");
        clinicsList.add("STOMAS Clinic");
        clinicsList.add("Dr.Batraliev clinic");
        clinicsList.add("Aurora");
        clinicsList.add("Azuu Dent");
        clinicsList.add("Royal Dent Plus");
        clinicsList.add("BiDent");
        clinicsList.add("MEDISTOM");
        clinicsList.add("Medcenter.kg");
        clinicsList.add("Green Clinic");
        clinicsList.add("ATLANT");
        clinicsList.add("Nobele Dent");
        clinicsList.add("Vertex Dental Clinic");
        clinicsList.add("Level Dent");
        clinicsList.add("Crystal");
        clinicsList.add("Biodent");
        clinicsList.add("Family dentist");
        clinicsList.add("Profi med");
        clinicsList.add("TRIODENT");
        clinicsList.add("Alpha");
        clinicsList.add("Adis");
        clinicsList.add("ASUR dent");
        clinicsList.add("Premium.dental.clinic");
        clinicsList.add("Siwak");
        clinicsList.add("Dentech clinic");
        clinicsList.add("Dr.Azis Dental Clinic");
    }

}