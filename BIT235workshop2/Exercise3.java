package BIT235workshop2;

public class Exercise3 {
    public static void main(String[] args) {
       double pi = 3.14;
        double r1 = 1;
        double r2 = 2;
        double r3 = 5;
        double area1 = pi * Math.pow(r1, 2);
        double area2 = pi * Math.pow(r2, 2);
        double area3 = pi * Math.pow(r3, 2);
        System.out.println(pi + " * " + r1 + " cm * " + r1 + " cm = " + area1 + " cm^2");
        System.out.println(pi + " * " + r2 + " cm * " + r2 + " cm = " + area2 + " cm^2");
        System.out.println(pi + " * " + r3 + " cm * " + r3 + " cm = " + area3 + " cm^2");
    }
}