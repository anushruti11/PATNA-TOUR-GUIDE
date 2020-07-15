package com.example.patnatourguide.ui;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.patnatourguide.R;
import com.example.patnatourguide.adapters.PlacesAdapter;
import com.example.patnatourguide.model.Place;

import java.util.ArrayList;
import java.util.List;

public abstract class PlacesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        List<Place> placesList = new ArrayList<>();
        getContents(placesList, getContext());


        View view = inflater.inflate(R.layout.places_fragment, container, false);
        PlacesAdapter adapter = new PlacesAdapter(getActivity(), 0, placesList);
        ListView placesListView = (ListView) view.findViewById(R.id.list_view);
        placesListView.setAdapter(adapter);

        return view;
    }

    public abstract void getContents(List<Place> list, Context context);
}