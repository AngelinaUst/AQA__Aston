package Lesson_7_junit_5;

public class AreaOfATriangle {
    private double aSide;
    private double bSide;
    private double cSide;

    public AreaOfATriangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    public double calculateAreaOfATriangle() {
        double halfPerimeter = (aSide + bSide + cSide) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide));
    }
}
