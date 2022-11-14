package com.company;

public class Smartphone {
    private static String seller;
    private Company company;
    private String model;
    private OS os;
    private double displaySize;
    private String color;
    private double weight;


    public  String getSeller() {
        return seller;
    }




    public static void setSeller(String seller) {
        Smartphone.seller = seller;
    }



    public Smartphone(Company company, String model, OS os, double displaySize, double weight) {
        this.company = company;
        this.model = model;
        this.os = os;
        this.displaySize = displaySize;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "company=" + company +
                ", model='" + model + '\'' +
                ", os=" + os +
                ", displaySize=" + displaySize +
                ", weight=" + weight +
                '}';
    }

    public Company getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public OS getOs() {
        return os;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public double getWeight() {
        return weight;
    }

    public Smartphone(Company company, String model) {
        this.company = company;
        this.model = model;
    }
}

enum Company{Samsung, Apple, Xiaomi, Sony};
enum OS{Android, IOS, Windows}