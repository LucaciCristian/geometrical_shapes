package ro.scoalainformala.geometrical_shapes;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculateArea() {
        double area = 3.14 * (r * r);
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = 2 * 3.14 * r;
        return perimeter;
    }
}
