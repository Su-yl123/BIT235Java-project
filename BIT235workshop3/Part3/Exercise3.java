package BIT235workshop3.Part3;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer(0-35)= ");
        int value = scanner.nextInt();
        if(value <=9){
            System.out.println(value);
        }else{
            char ch = (char)(65 + (value -10));
            System.out.println(ch);
        }
        scanner.close();
    }
}
