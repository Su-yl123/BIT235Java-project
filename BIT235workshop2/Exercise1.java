package BIT235workshop2;
import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = scanner.nextInt();
        int difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + difference);
        scanner.close();
    }
}