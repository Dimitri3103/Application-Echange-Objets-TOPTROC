package com.example.toptroc.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toptroc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyObjectsFragment extends Fragment {


    public MyObjectsFragment() {
        // Required empty public constructor
    }

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_my_objects, container, false);
        return view;
    }
}