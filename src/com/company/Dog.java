package com.company;

import java.awt.*;

public class Dog {
    private String dogPoroda;
    private String nameDog;
    private int ageDog;
    private double weightDog;
    private String colorDog;

    public void showInfo(){
        System.out.println("dogPoroda: " + dogPoroda);
        System.out.println("nameDog: " + nameDog);
        System.out.println("ageDog = " + ageDog);
        System.out.println("weightDog = " + weightDog+"kg");
        System.out.println("colorDog: " + colorDog);
    }

    public String getDogPoroda() {
        return dogPoroda;
    }

    public void setDogPoroda(String dogPoroda) {
        this.dogPoroda = dogPoroda;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    public double getWeightDog() {
        return weightDog;
    }

    public void setWeightDog(double weightDog) {
        this.weightDog = weightDog;
    }

    public String getColorDog() {
        return colorDog;
    }

    public void setColorDog(String colorDog) {
        this.colorDog = colorDog;
    }
    void dog(){
        System.out.println("Собака из мультфильма 101 далматинца");
    }
}
