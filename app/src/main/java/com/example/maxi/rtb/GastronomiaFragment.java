package com.example.maxi.rtb;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class GastronomiaFragment extends Fragment {

    ListView lvGastronomia;

    public GastronomiaFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gastronomia_fragment_list, container, false);

        lvGastronomia = (ListView) view.findViewById(R.id.lvGastronomia);


        return view;
    }
}
