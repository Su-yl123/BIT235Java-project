package BIT235workshop3.Part3;

public class Exercise4A {
    public static void main(String[] args) {
        long sumSquare =0;
        for(int k=1;k<=100;k++){
            sumSquare = sumSquare + (long)k*k;
        }
        System.out.println("Sum of squares first 100 integers = " + sumSquare);
    }
}
