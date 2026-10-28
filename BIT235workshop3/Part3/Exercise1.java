package BIT235workshop3.Part3;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number(1-24)= ");
        int hour = scanner.nextInt();
        if(hour < 18){
            System.out.println("Good day");
        }else{
            System.out.println("Good evening");
        }

        int num = 10;
        System.out.println("Multiples of 5 between 10-95:");
        while(num <=95){
            System.out.print(num + " ");
            num = num +5;
        }
        System.out.println();

        int sum =0;
        int i=1;
        while(i<=10){
            sum = sum +i;
            i++;
        }
        System.out.println("Sum 1-10 = " + sum);
        scanner.close();
    }
}
