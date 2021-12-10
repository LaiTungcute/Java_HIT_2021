package Bai2;

public class RunMain {
    public static void main(String[] args) {
        Ishape[] ishapes = new Ishape[3];
        ishapes[0] = new Rectangle(4,3);
        ishapes[1] = new Rectangle(3.5, 2.3);
        ishapes[2] = new Circle(5.5);
        for (int i = 0; i < 3; i++) {
            System.out.println("Area of ishapes["+i+"]: "+ishapes[i].getArea());
            System.out.println("Permeter of ishapes["+i+"]: "+ishapes[i].getPerimerter());
        }
    }
}
