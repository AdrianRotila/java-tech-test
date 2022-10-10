package com.company.parking;

public class Space {

    private int spaces;

    public Space(int spaces) {
        this.spaces = spaces;
    }

    public int getSpaces() {
        return spaces;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }

    @Override
    public String toString() {
        return spaces + " left";
    }
}
