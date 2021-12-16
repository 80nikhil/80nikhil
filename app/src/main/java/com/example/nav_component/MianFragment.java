package com.example.nav_component;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MianFragment extends Fragment {

   View view;
   Button viewtransaction,viewbalance,sendmoney;

    public MianFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_mian, container, false);

        viewtransaction =view.findViewById(R.id.btn_viewtransaction);
        viewbalance=view.findViewById(R.id.btn_viewbalance);
        sendmoney = view.findViewById(R.id.btn_sendmoney);
        viewtransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mianFragment_to_transactionFragment);
            }
        });
        sendmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Navigation.findNavController(view).navigate(R.id.action_mianFragment_to_recipientFragment);
            }
        });
        viewbalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_mianFragment_to_viewBalannceFragment);
            }
        });
        
        return  view;
    }
}