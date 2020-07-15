package com.example.patnatourguide.helpers;


import android.content.Context;

import com.example.patnatourguide.R;
import com.example.patnatourguide.model.Place;

import java.util.List;

public class Utils {

    public static void populateAboutList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.About_1_name),
                context.getString(R.string.About_1_description),
                context.getString(R.string.About_1_address),
                R.drawable.airport
        ));

        list.add(new Place(
                context.getString(R.string.About_2_name),
                context.getString(R.string.About_2_description),
                context.getString(R.string.About_2_address),
                R.drawable.busstand
        ));

        list.add(new Place(
                context.getString(R.string.About_3_name),
                context.getString(R.string.About_3_description),
                context.getString(R.string.About_3_address),
                R.drawable.railway
        ));

    }

    public static void populateHotelsList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.Hotel_1_name),
                context.getString(R.string.Hotel_1_description),
                context.getString(R.string.Hotel_1_address),

                R.drawable.hotelmaurya
        ));

        list.add(new Place(
                context.getString(R.string.Hotel_2_name),
                context.getString(R.string.Hotel_2_description),
                context.getString(R.string.Hotel_2_address),

                R.drawable.lemontree
        ));

        list.add(new Place(
                context.getString(R.string.Hotel_3_name),
                context.getString(R.string.Hotel_3_description),
                context.getString(R.string.Hotel_3_address),

                R.drawable.hotelpatliputra
        ));

        list.add(new Place(
                context.getString(R.string.Hotel_4_name),
                context.getString(R.string.Hotel_4_description),
                context.getString(R.string.Hotel_4_address),

                R.drawable.hotelchanakya
        ));

        list.add(new Place(
                context.getString(R.string.Hotel_5_name),
                context.getString(R.string.Hotel_5_description),
                context.getString(R.string.Hotel_5_address),

                R.drawable.gingerpatna
        ));
    }

    public static void populateRestaurantsList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.Restaurant_1_name),
                context.getString(R.string.Restaurant_1_description),
                context.getString(R.string.Restaurant_1_address),
                R.drawable.degrees
        ));

        list.add(new Place(
                context.getString(R.string.Restaurant_2_name),
                context.getString(R.string.Restaurant_2_description),
                context.getString(R.string.Restaurant_2_address),

                R.drawable.coookbookcafe
        ));

        list.add(new Place(
                context.getString(R.string.Restaurant_3_name),
                context.getString(R.string.Restaurant_3_description),
                context.getString(R.string.Restaurant_3_address),

                R.drawable.pindballuchi
        ));

        list.add(new Place(
                context.getString(R.string.Restaurant_4_name),
                context.getString(R.string.Restaurant_4_description),
                context.getString(R.string.Restaurant_4_address),

                R.drawable.kfc
        ));


    }

    public static void populatePlacessList(List<Place> list, Context context) {

        list.add(new Place(
                context.getString(R.string.Place_1_name),
                context.getString(R.string.Place_1_description),
                context.getString(R.string.Place_1_address),

                R.drawable.biharmuseum
        ));

        list.add(new Place(
                context.getString(R.string.Place_2_name),
                context.getString(R.string.Place_2_description),
                context.getString(R.string.Place_2_address),

                R.drawable.planetaurium
        ));

        list.add(new Place(
                context.getString(R.string.Place_3_name),
                context.getString(R.string.Place_3_description),
                context.getString(R.string.Place_3_address),

                R.drawable.pnmmall
        ));

        list.add(new Place(
                context.getString(R.string.Place_4_name),
                context.getString(R.string.Place_4_description),
                context.getString(R.string.Place_4_address),

                R.drawable.buddhasmritipark
        ));


    }
}
