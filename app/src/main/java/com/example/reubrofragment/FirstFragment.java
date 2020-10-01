package com.example.reubrofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstFragment extends Fragment {
    Button fButton;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            View v= inflater.inflate(R.layout.fragment_first, container, false);

            fButton=v.findViewById(R.id.button);
            fButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    SecondFragment secondFragment=new SecondFragment();
                    FragmentTransaction transaction =getFragmentManager().beginTransaction();
                    transaction.replace(R.id.mainlayout,secondFragment);
                    transaction.commit();

                }
            });
            return  v;

    }
}
