package soal1;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double r, double h) {
        super("Cylinder");
        setRadius(r);
        setHeight(h);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return Math.PI * (getRadius() * getRadius()) * getHeight();
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + getRadius() + " and height " + getHeight();
    }
}