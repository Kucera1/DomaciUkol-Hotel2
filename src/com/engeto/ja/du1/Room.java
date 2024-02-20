package com.engeto.ja.du1;

import java.math.BigDecimal;

public class Room {
    private int noOfRoom;
    private String beds;
    private boolean balcony;
    private boolean seaViews;
    private BigDecimal priceForNight;

    @Override
    public String toString() {
        return noOfRoom + ", " + beds + " " + "with Balcony:" +  balcony + ", " + "with Sea views:" + seaViews + ", " + "Price for night:" + priceForNight;
    }

    public Room(int noOfRoom, String beds, boolean balcony, boolean seaViews, BigDecimal priceForNight) {
        this.noOfRoom = noOfRoom;
        this.beds = beds;
        this.balcony = balcony;
        this.seaViews = seaViews;
        this.priceForNight = priceForNight;
    }

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public String getBeds() {
        return beds;
    }

    public void setBeds(String beds) {
        this.beds = beds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaViews() {
        return seaViews;
    }

    public void setSeaViews(boolean seaViews) {
        this.seaViews = seaViews;
    }

    public BigDecimal getPriceForNight() {
        return priceForNight;
    }

    public void setPriceForNight(BigDecimal priceForNight) {
        this.priceForNight = priceForNight;
    }
}
