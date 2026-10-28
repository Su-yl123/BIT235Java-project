package BIT235workshop3;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter word = ");
        String word = scanner.nextLine();
        StringBuffer sb = new StringBuffer(word);
        String reversed = sb.reverse().toString();
        boolean isPalindrome = word.equals(reversed);
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is palindrome: " + isPalindrome);
        scanner.close();
    }
}
