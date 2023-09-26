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
        double p = calculatePerimeter();
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

}
