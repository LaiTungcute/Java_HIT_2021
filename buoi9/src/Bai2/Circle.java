package Bai2;

public class Circle implements Ishape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getPerimerter() {
        return 2*3.14*radius;
    }
}
