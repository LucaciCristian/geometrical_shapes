package ro.scoalainformala.geometrical_shapes;

public class Square {
    private double l;

    public Square(double l) {
        this.l = l;
    }

    public double calculateArea() {
        double area = l * l;
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = l * 4;
        return perimeter;
    }
}
