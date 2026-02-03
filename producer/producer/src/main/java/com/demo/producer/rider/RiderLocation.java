package com.demo.producer.rider;

public class RiderLocation {
    public RiderLocation(String riderID, double latitude, double longitude) {
        this.riderID = riderID;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private String riderID;
    private double latitude;
    private double longitude;

    public String getRiderID() {
        return riderID;
    }

    public void setRiderID(String riderID) {
        this.riderID = riderID;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
