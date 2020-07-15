package com.example.patnatourguide.ui;

import android.content.Context;

import com.example.patnatourguide.helpers.Utils;
import com.example.patnatourguide.model.Place;

import java.util.List;

public class RestaurantsFragment extends PlacesFragment {

    @Override
    public void getContents(List<Place> list, Context context) {
        Utils.populateRestaurantsList(list, context);
    }
}

