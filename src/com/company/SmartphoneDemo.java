package com.company;

public class SmartphoneDemo {
    public static void main(String[] args) {
        Smartphone.setSeller("Рога и копыта");
        Smartphones smartphones = new Smartphones();
        smartphones.add(new Smartphone(Company.Apple, "iPhone 13", OS.IOS, 6, 200));
        smartphones.add(new Smartphone(Company.Apple, "iPhone 12", OS.IOS, 5, 200));
        smartphones.add(new Smartphone(Company.Samsung, "Galaxy", OS.Android, 5, 200));
        smartphones.printCompany(Company.Apple);
    }
}
