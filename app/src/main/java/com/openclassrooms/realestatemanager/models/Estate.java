package com.openclassrooms.realestatemanager.models;

import android.location.Location;

import java.util.Date;
import java.util.List;

public class Estate {
    private String id;
    private EstateType type;
    private String city;
    private double priceInDollars;
    private int surface;
    private int rooms_count;
    private int bathrooms_count;
    private int bedrooms_count;
    private String address;
   // private List<Place> nearbyPlaces;
    private Location location;
    private String description;
    private List<Media> medias;
    private Date entryDate;
    private Date saleDate;
    private Boolean isAvailable;
    private Boolean isFurnished;
    private int assignedAgentId;


}