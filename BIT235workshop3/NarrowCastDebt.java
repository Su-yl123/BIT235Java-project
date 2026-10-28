package BIT235workshop3;

public class NarrowCastDebt {
    public static void main(String[] args) {
        System.out.println("Task 1: long to int cast");
        long nationalDebtLong = 34000000000000L;
        int nationalDebtInt = (int) nationalDebtLong;
        System.out.println("Long value: " + nationalDebtLong);
        System.out.println("Cast to int: " + nationalDebtInt);

        System.out.println("\nTask 2: double to byte cast");
        double nationalDebtDouble = 34000000000000.0;
        byte nationalDebtByte = (byte) nationalDebtDouble;
        System.out.println("Double value: " + nationalDebtDouble);
        System.out.println("Cast to byte: " + nationalDebtByte);
    }
}
