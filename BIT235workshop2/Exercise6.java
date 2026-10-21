package BIT235workshop2;

public class Exercise6 {
    public static void main(String[] args) {
        double tank = 40;
        double normalConsume = 8;
        double roughConsume = normalConsume * 1.15;
        double normalDistance = tank / normalConsume * 100;
        double roughDistance = tank / roughConsume * 100;
        System.out.println("Normal road: " + tank + " L / " + normalConsume + " L/100km * 100 = " + normalDistance + " km");
        System.out.println("Rough road consume = " + normalConsume + " L/100km * 1.15 = " + roughConsume + " L/100km");
        System.out.println("Rough road: " + tank + " L / " + roughConsume + " L/100km * 100 = " + roughDistance + " km");
    }
}
