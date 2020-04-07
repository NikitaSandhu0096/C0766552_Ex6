package com.example.c0766552_ex.model;

import android.widget.ImageView;

import java.io.Serializable;

public class CanadaAttraction implements Serializable {
    private int placeId;
    private String placeName;
    private String address;
    private String city;
    private String province;
    private String description;
    private int imagePlace;

    public CanadaAttraction(int placeId, String placeName, String address, String city, String province, String description, int image) {
        this.placeId = placeId;
        this.placeName = placeName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.description = description;
        this.imagePlace = image;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImagePlace() {
        return imagePlace;
    }

    public void setImagePlace(int imagePlace) {
        this.imagePlace = imagePlace;
    }
}
