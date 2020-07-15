package com.example.patnatourguide.adapters;


import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.patnatourguide.R;
import com.example.patnatourguide.model.Place;

import java.util.List;


public class PlacesAdapter extends ArrayAdapter<Place> {

    public PlacesAdapter(Context context, int resource, List<Place> placesList) {
        super(context, 0, placesList);
    }


    private static class ViewHolder {
        TextView name;
        TextView description;
        TextView address;
        ImageView photo;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

            holder = new ViewHolder();
            holder.name = convertView.findViewById(R.id.name);
            holder.description = convertView.findViewById(R.id.description);
            holder.address = convertView.findViewById(R.id.address);
            holder.photo = convertView.findViewById(R.id.photo);


            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        final Place currentPlace = getItem(position);
        assert currentPlace != null;
        holder.name.setText(currentPlace.getName());

        if (currentPlace.hasDescription()) {
            holder.description.setText(currentPlace.getDescription());
            holder.description.setVisibility(View.VISIBLE);
        } else {
            holder.description.setVisibility(View.GONE);
        }

        if (currentPlace.hasAddress()) {
            holder.address.setText(currentPlace.getAddress());
            holder.address.setPaintFlags(holder.address.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
            holder.address.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Uri mapUri = Uri.parse("geo:0,0?q=" + Uri.encode(currentPlace.getAddress()));
                    Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
                    mapIntent.setPackage("com.google.android.apps.maps");
                    getContext().startActivity(mapIntent);
                }
            });
        } else {
            holder.address.setVisibility(View.GONE);
        }


        if (currentPlace.hasImage()) {
            holder.photo.setImageResource(currentPlace.getImageResourceId());
        } else {
            holder.photo.setVisibility(View.GONE);
        }

        return convertView;
    }


}
