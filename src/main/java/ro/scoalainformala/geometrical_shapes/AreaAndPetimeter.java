package ro.scoalainformala.geometrical_shapes;

public class AreaAndPetimeter {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("The area of the triangle is: " + triangle.calculateArea());
        System.out.println("The perimeter of the triangle is: " + triangle.calculatePerimeter());

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
        System.out.println("The perimeter of the rectangle is: " + rectangle.calculatePerimeter());

        Square square = new Square(5);
        System.out.println("The area of the square is:" + square.calculateArea());
        System.out.println("The perimeter of the square is: " + square.calculatePerimeter());

        Circle circle = new Circle(6);
        System.out.println("The area of the circle is: " + circle.calculateArea());
        System.out.println("The perimeter of the circle is: " + circle.calculatePerimeter());
    }
    
}
