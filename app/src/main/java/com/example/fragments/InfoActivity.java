package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        TextView TVname = findViewById(R.id.TVname);
        TextView TVaddress = findViewById(R.id.TVaddress);
        TextView TVuniversity = findViewById(R.id.TVuniversity);
        TextView TVspecialization = findViewById(R.id.TVspecialization);
        TextView TVstunumber = findViewById(R.id.TVstunumber);
        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        TVname.setText(name);

        String address = intent.getStringExtra("address");
        TVaddress.setText(address);

        String UniversityName = intent.getStringExtra("UniversityName");
        TVuniversity.setText(UniversityName);

        String UniversitySpecialization = intent.getStringExtra("UniversitySpecialization");
        TVspecialization.setText(UniversitySpecialization);

        String UniversityNum = intent.getStringExtra("UniversityNum");
        TVstunumber.setText(UniversityNum);












    }
}