package BIT235workshop3.Part3;
import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter picture length(inch) = ");
        double length = scanner.nextDouble();
        System.out.print("Enter picture width(inch) = ");
        double width = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter frame type(regular/fancy) = ");
        String frameType = scanner.nextLine();
        System.out.print("Enter frame colour = ");
        String colour = scanner.nextLine();
        System.out.print("Enter number of crowns = ");
        int crownCount = scanner.nextInt();

        double perimeter = 2 * (length + width);
        double colourCost = perimeter * 0.10;
        double frameCost;
        if(frameType.equals("regular")){
            frameCost = perimeter *0.15;
        }else{
            frameCost = perimeter *0.25;
        }
        double crownCost = crownCount * 0.35;
        double totalCost = colourCost + frameCost + crownCost;

        System.out.println("Picture length: "+length+" inch");
        System.out.println("Picture width: "+width+" inch");
        System.out.println("Frame type: "+frameType);
        System.out.println("Frame colour: "+colour);
        System.out.println("Crown count: "+crownCount);
        System.out.println("Total framing cost: $"+totalCost);
        scanner.close();
    }
}
