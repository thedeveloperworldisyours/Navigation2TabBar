package com.thedeveloperworldisyours.maquetasinnombre.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thedeveloperworldisyours.maquetasinnombre.R;

public class ThirdTabFragment extends Fragment {

    public ThirdTabFragment() {
        // Required empty public constructor
    }

    public static ThirdTabFragment newInstance() {
        return new ThirdTabFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_tab, container, false);
    }

}
