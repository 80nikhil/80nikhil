package com.example.nav_component;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class RecipientFragment extends Fragment {

   View view;
    Button send ,cancel;
    EditText name;

    public RecipientFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_recipient, container, false);
        send = view.findViewById(R.id.btn_next);
        cancel = view.findViewById(R.id.btn_cancel);
        name =view.findViewById(R.id.et_name);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavDirections  directions = RecipientFragmentDirections.actionRecipientFragmentToSpecifyAmountFragment(name.getText().toString());
                Navigation.findNavController(view).navigate(directions);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigateUp();
            }
        });
        return  view;
    }
}