package Bai2;

public class Rectangle implements Ishape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimerter() {
        return (length+width)*2;
    }
}
