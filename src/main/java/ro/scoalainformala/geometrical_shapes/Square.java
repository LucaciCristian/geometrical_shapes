package ro.scoalainformala.geometrical_shapes;

public class Square {
    private double l;

    public Square(double l) {
        this.l = l;
    }

    public double calculateArea() {
        return l * l;
    }

    public double calculatePerimeter() {
        return l * 4;
    }
}
