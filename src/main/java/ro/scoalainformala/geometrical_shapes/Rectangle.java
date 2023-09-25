package ro.scoalainformala.geometrical_shapes;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double calculateArea() {
        double area = length * width;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

}
