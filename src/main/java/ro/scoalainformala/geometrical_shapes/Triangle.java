package ro.scoalainformala.geometrical_shapes;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double calculateArea() {
        double p = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    public double calculatePerimeter() {
        double perimeter = sideA + sideB + sideC;
        return perimeter;
    }

}
