package soal1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        super("Rectangle");
        setLength(l);
        setWidth(w);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return super.toString() + " of length " + getLength() + " and width " + getWidth();
    }
}