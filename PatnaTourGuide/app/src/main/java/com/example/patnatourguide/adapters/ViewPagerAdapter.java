package com.example.patnatourguide.adapters;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.patnatourguide.R;
import com.example.patnatourguide.ui.AboutFragment;
import com.example.patnatourguide.ui.RestaurantsFragment;
import com.example.patnatourguide.ui.HotelsFragment;
import com.example.patnatourguide.ui.PlacessFragment;


public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public ViewPagerAdapter(Context context, FragmentManager manager) {
        super(manager);
        mContext = context;
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutFragment();
        } else if (position == 1) {
            return new PlacessFragment();
        } else if (position == 2) {
            return new RestaurantsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_about);
        } else if (position == 1) {
            return mContext.getString(R.string.category_places);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_hotels);
        }
    }
}


