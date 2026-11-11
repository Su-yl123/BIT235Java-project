package Exercise7;

public class Driver {
    public static void main(String[] args) {
        Boxes box1 = new Boxes(3);
        System.out.println(box1);
        box1.draw();

        System.out.println();

        Boxes box2 = new Boxes(8);
        System.out.println(box2);
        box2.draw();

        box2.setSize(10);
        System.out.println(box2);
        box2.draw();
    }
}
