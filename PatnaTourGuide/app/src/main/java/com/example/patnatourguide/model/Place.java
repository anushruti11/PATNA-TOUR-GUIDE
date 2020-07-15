package com.example.patnatourguide.model;

public class Place {

    private String mName;
    private String mDescription;
    private String mAddress;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    public Place(String name, String description, String address, int imageResourceId) {

        mName = name;
        mDescription = description;
        mAddress = address;

        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }


    public String getAddress() {
        return mAddress;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasDescription() {
        return mDescription != null;
    }


    public boolean hasAddress() {
        return getAddress() != null;
    }


    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


    @Override
    public String toString() {
        String output;
        output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +

                getImageResourceId();

        return output;
    }
}

