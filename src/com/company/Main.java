package com.company;

public class Main {

    public static void main(String[] args) {
	double r1=1;
	double r2=2;
	double r3=3;
	double s1= Math.PI*r1*r1;
	double s2= Math.PI*r2*r2;
	double s3= Math.PI*r3*r3;
	double l1= Math.PI*r1;
	double l2= Math.PI*r2;
	double l3= Math.PI*r3;
	s1=areaCircle(r1);
        Circle circle = new Circle();
        for(int i=0; i<3; i++){
            circle.setRadius(1+i);
        System.out.println(Circle.area());
        System.out.println(Circle.length());}}

    static double areaCircle(double r){
        return Math.PI*r*r;

    }
    static double lengthCircle(double r ){
        return 2*Math.PI*r;

    }




}
 class Circle  {
    private  static double radius;// радиус круга


    public static double area() {
        return Math.PI * radius * radius;

    }

    public static double length() {
        return 2 * Math.PI * radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }
}