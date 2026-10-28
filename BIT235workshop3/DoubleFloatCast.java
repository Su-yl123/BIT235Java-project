package BIT235workshop3;

public class DoubleFloatCast {
    public static void main(String[] args) {
        double piDouble = 3.1415926535;
        float piFloat = (float) piDouble;
        System.out.println("PI double: " + piDouble);
        System.out.println("PI float: " + piFloat);

        double money1 = 23.99;
        System.out.println("Money 23.99 double: " + money1);

        double money2 = 23.00;
        System.out.println("Money 23.00 double: " + money2);
    }
}
