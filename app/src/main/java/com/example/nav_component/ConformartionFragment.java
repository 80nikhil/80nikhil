package com.example.nav_component;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class ConformartionFragment extends Fragment {
 View view;

   TextView amount ,name;
    public ConformartionFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_conformartion, container, false);

        amount =view.findViewById(R.id.txt_amount);
        name =view.findViewById(R.id.txt_name);

        name.setText(ConformartionFragmentArgs.fromBundle(getArguments()).getName());
        amount.setText(ConformartionFragmentArgs.fromBundle(getArguments()).getAmount());


        return  view;
    }
}