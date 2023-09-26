package ro.scoalainformala.geometrical_shapes;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double calculateArea() {
        return Math.PI   * (r * r);
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}
