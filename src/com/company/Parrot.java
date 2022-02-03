package com.company;

import java.awt.*;

public class Parrot {
    private String parVid;
    private String namePar;
    private int ageParrot;
    private double weightParrot;
    private String colorPar;

    public void showInfo(){
        System.out.println("parVid: " + parVid);
        System.out.println("namePar: " + namePar);
        System.out.println("ageParrot = " + ageParrot);
        System.out.println("weightParrot = " + weightParrot+"kg");
        System.out.println("colorPar: " + colorPar);
    }

    public String getparVid() {
        return parVid;
    }

    public void setparVid(String vid) {
        parVid = vid;
    }

    public String getNamePar() {
        return namePar;
    }

    public void setNamePar(String namePar) {
        this.namePar = namePar;
    }

    public int getAgeParrot() {
        return ageParrot;
    }

    public void setAgeParrot(int ageParrot) {
        this.ageParrot = ageParrot;
    }

    public double getWeightParrot() {
        return weightParrot;
    }

    public void setWeightParrot(double weightParrot) {
        this.weightParrot = weightParrot;
    }

    public String getColorPar() {
        return colorPar;
    }

    public void setColorPar(String colorPar) {
        this.colorPar = colorPar;
    }
    void parrot(){
        System.out.println("Попупай из мультфильма РИО");
    }
}
