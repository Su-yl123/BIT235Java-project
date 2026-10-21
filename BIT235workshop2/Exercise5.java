package BIT235workshop2;

public class Exercise5 {
    public static void main(String[] args) {
        double pi = 3.14;
        double sunDiameter = 865000;
        double earthDiameter = 7600;
        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;
        double earthVolume = (4.0 / 3) * pi * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3) * pi * Math.pow(sunRadius, 3);
        double ratio = sunVolume / earthVolume;
        System.out.println("Earth radius = " + earthRadius + " miles");
        System.out.println("(4.0/3) * " + pi + " * " + earthRadius + "^3 = " + earthVolume + " cubic miles");
        System.out.println("Sun radius = " + sunRadius + " miles");
        System.out.println("(4.0/3) * " + pi + " * " + sunRadius + "^3 = " + sunVolume + " cubic miles");
        System.out.println(sunVolume + " / " + earthVolume + " = " + ratio + " (no unit)");
    }
}
