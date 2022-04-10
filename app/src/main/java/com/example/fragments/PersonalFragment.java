package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class PersonalFragment extends Fragment {

    public PersonalFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal, container, false);
        EditText edStuName = view.findViewById(R.id.edStuName);
        EditText edStuAddress = view.findViewById(R.id.edStuAddress);
        Button btnNext = view.findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                String name = edStuName.getText().toString();
                bundle.putString("name", name );

                String address = edStuAddress.getText().toString();
                bundle.putString("address", address);

                if (!name.equals("") && !address.equals("")) {
                    UniversityFragment universityFragment = new UniversityFragment();
                    universityFragment.setArguments(bundle);

                    FragmentManager fm = getActivity().getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.flContainer, universityFragment);
                    ft.addToBackStack(null);
                    ft.commit();

                } else {
                    Toast.makeText(getActivity(), "Name and Address can't be empty", Toast.LENGTH_SHORT).show();
                }

            }
        });
        return view;
    }
}