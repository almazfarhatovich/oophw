package com.company;

import java.awt.*;

public class Cat {
    private String catPoroda;
    private String nameCat;
    private int ageCat;
    private double weightCat;
    private String colorCat;

    public void showInfo(){
        System.out.println("catPoroda: " + catPoroda);
        System.out.println("nameCat: " + nameCat);
        System.out.println("ageCat = " + ageCat);
        System.out.println("weightCat = " + weightCat+"kg");
        System.out.println("colorCat: " + colorCat);
    }

    public String getCatPoroda() {
        return catPoroda;
    }

    public void setCatPoroda(String catPoroda) {
        this.catPoroda = catPoroda;
    }

    public String getNameCcat() {
        return nameCat;
    }

    public void setNameCcat(String nameCcat) {
        this.nameCat = nameCcat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public void setAgeCat(int ageCat) {
        this.ageCat = ageCat;
    }

    public double getWeightCat() {
        return weightCat;
    }

    public void setWeightCat(double weightCat) {
        this.weightCat = weightCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }
    void cat(){
        System.out.println("кот из из мультфильма Золушка");
    }
}
