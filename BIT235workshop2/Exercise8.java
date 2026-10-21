package BIT235workshop2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string1 = ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string2 = ");
        String s2 = scanner.nextLine();
        boolean strEqual = s1.equals(s2);
        char c1 = s1.charAt(0);
        char c2 = s2.charAt(0);
        boolean charEqual = c1 == c2;
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
        System.out.println("the two given strings are equal " + strEqual);
        System.out.println("First char of string1: " + c1);
        System.out.println("First char of string2: " + c2);
        System.out.println("First characters equal: " + charEqual);
        scanner.close();
    }
}
