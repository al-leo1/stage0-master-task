package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;
    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color=color;
        this.numberOfPaws=numberOfPaws;
        this.hasFur=hasFur;
    }
    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean hasFur() {
        return hasFur;
    }

    public String getDescription() {
        String valueOfFur = hasFur ? "a" : "no";
        String pawsOrPaws = numberOfPaws>1 ? " paws" : " paw";
        return "This animal is mostly "+color+". It has "+numberOfPaws+ pawsOrPaws + " and " + valueOfFur + " fur." ;
    }


}
