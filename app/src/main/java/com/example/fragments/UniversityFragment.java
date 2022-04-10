package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UniversityFragment extends Fragment {

    private String name;
    private String address;


    public UniversityFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (getArguments() != null) {
            name = getArguments().getString("name");
            address = getArguments().getString("address");

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_university, container, false);
        TextView tvname = view.findViewById(R.id.TVname);
        TextView tvaddress = view.findViewById(R.id.TVaddress);

        tvname.setText(name);
        tvaddress.setText(address);

        EditText edtvUniversityName = view.findViewById(R.id.edtvUniversityName);
        EditText edtvUniversitySpecialization = view.findViewById(R.id.edtvUniversitySpecialization);
        EditText edtvUniversityNum = view.findViewById(R.id.edtvUniversityNum);
        Button btnfinish = view.findViewById(R.id.btnFinish);
        Intent myIntent = new Intent(getActivity(), InfoActivity.class);

        btnfinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getActivity(), InfoActivity.class);

                String name = tvname.getText().toString();
                myIntent.putExtra("name", name);

                String address = tvaddress.getText().toString();
                myIntent.putExtra("address", address);

                String UniversityName = edtvUniversityName.getText().toString();
                myIntent.putExtra("UniversityName", UniversityName);

                String UniversitySpecialization = edtvUniversitySpecialization.getText().toString();
                myIntent.putExtra("UniversitySpecialization", UniversitySpecialization);

                String UniversityNum = edtvUniversityNum.getText().toString();
                myIntent.putExtra("UniversityNum", UniversityNum);

                startActivity(myIntent);


            }
        });

        return view;
    }
}