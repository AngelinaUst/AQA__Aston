package Lesson_7_junit_5;

public class AreaOfATriangle {
    //    позволяющую найти площадь треугольника;
    public static double calculateAreaOfATriangle(double aSide, double bSide, double cSide){
        double halfPerimeter = (aSide + bSide + cSide) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSide) * (halfPerimeter - bSide) * (halfPerimeter - cSide));
    }
}
