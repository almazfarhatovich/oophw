package com.company;

import java.awt.*;

public class Fish {
    private String nameVid;
    public String nameFish;
    private int ageFish;
    private double weightFish;
    private String colorFish;


    public void showInfo(){
        System.out.println("nameVid: " + nameVid);
        System.out.println("nameFish: " + nameFish);
        System.out.println("ageFish = " + ageFish);
        System.out.println("weightFish = " + weightFish+"kg");
        System.out.println("colorFish: " + colorFish);
    }
    public String getNameVid() {
        return nameVid;
    }
    public void setNameVid(String nameVid){
        this.nameVid = nameVid;
    }

    public String getNameFish() {
        return nameFish;
    }

    public void setNameFish(String nameFish) {
        this.nameFish = nameFish;
    }

    public int getAgeFish() {
        return ageFish;
    }

    public void setAgeFish(int ageFish) {
        this.ageFish = ageFish;
    }

    public double getWeightFish() {
        return weightFish;
    }

    public void setWeightFish(double weightFish) {
        this.weightFish = weightFish;
    }

    public String getColorFish() {
        return colorFish;
    }

    public void setColorFish(String colorFish) {
        this.colorFish = colorFish;
    }
    void fish(){
        System.out.println("Рыбка из мультфильма Русалочка");
    }
}
