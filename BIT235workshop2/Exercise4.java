package BIT235workshop2;

public class Exercise4 {
    public static void main(String[] args) {
        double P = 5000.00;
        double r = 0.04;
        int n = 10;
        double A = P * Math.pow((1 + r), n);
        System.out.println(P + " USD * (1 + " + r + ")^" + n + " = " + A + " USD");
    }
}
