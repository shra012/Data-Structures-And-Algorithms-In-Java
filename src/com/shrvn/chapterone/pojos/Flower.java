package com.shrvn.chapterone.pojos;

public class Flower {
    private String name;
    private int noOfPetals;
    private float prize;

    public Flower(String name, int noOfPetals, float prize) {
        this.name = name;
        this.noOfPetals = noOfPetals;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPetals() {
        return noOfPetals;
    }

    public void setNoOfPetals(int noOfPetals) {
        this.noOfPetals = noOfPetals;
    }

    public float getPrize() {
        return prize;
    }

    public void setPrize(float prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", noOfPetals=" + noOfPetals +
                ", prize=" + prize +
                '}';
    }
}
