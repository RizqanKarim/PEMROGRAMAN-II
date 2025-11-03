package soal1;

public class Paint {
    private double coverage;

    public Paint(double c) {
        setCoverage(c); // [cite: 80-84]
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        return s.area() / getCoverage();
    }
}