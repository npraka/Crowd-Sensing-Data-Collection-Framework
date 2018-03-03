package com.example.neil.crowdsensingui;

/**
 * Created by Neil on 1/18/2018.
 */

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Tab2Marketplace extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2marketplace, container, false);
        String[] menuItens = {"GPS Data Pooling", "Traffic Area", "Proximity Pooling","GPS Data Pooling", "Traffic Area", "Proximity Pooling","GPS Data Pooling", "Traffic Area", "Proximity Pooling",
                "GPS Data Pooling", "Traffic Area", "Proximity Pooling","GPS Data Pooling", "Traffic Area", "Proximity Pooling"};

        ListView listView = (ListView) rootView.findViewById(R.id.marketplaceApps);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(


                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItens

                );
        listView.setAdapter(listViewAdapter);





        return rootView;



    }


}