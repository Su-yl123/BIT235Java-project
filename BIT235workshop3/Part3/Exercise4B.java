package BIT235workshop3.Part3;

public class Exercise4B {
    public static void main(String[] args) {
        System.out.println("Perfect squares 1-100:");
        for(int x=1;x<=100;x++){
            double sqrtVal = Math.sqrt(x);
            if(sqrtVal == Math.floor(sqrtVal)){
                System.out.print(x + " ");
            }
        }
    }
}
