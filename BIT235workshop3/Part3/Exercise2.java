package BIT235workshop3.Part3;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number = ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter second number = ");
        double n2 = scanner.nextDouble();
        System.out.print("Enter third number = ");
        double n3 = scanner.nextDouble();

        double min = n1;
        if(n2 < min) min = n2;
        if(n3 < min) min = n3;
        System.out.println("Smallest number: " + min);
        scanner.close();
    }
}
