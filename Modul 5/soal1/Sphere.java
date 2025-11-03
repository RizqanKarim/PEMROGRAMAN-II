package soal1;

public class Sphere extends Shape {
    private double radius;

    public Sphere(double r) {
        super("Sphere");
        setRadius(r);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {
        return super.toString() + " of radius " + getRadius();
    }
}