package BIT235workshop2;

public class Exercise7 {
    public static void main(String[] args) {
        String original = "I love java programming";
        String s = original.substring(7, 11);
        System.out.println("Expression: " + original + ".substring(7,11)");
        System.out.println("Result string: " + s);
        System.out.println("String length: " + s.length() + " characters");
    }
}
