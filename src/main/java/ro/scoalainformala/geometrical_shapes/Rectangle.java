package ro.scoalainformala.geometrical_shapes;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return  (2 * length) + (2 * width);
    }

}
