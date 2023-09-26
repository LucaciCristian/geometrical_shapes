package ro.scoalainformala.geometrical_shapes;

import java.util.Scanner;

public class AreaAndPetimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the sides of the triangle: ");
        Triangle triangle = new Triangle(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("The area of the triangle is: " + triangle.calculateArea() + " cm\u00B2");
        System.out.println("The perimeter of the triangle is: " + triangle.calculatePerimeter());

        System.out.print("Please enter the length and width of the rectangle: ");
        Rectangle rectangle = new Rectangle(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea() + " cm\u00B2");
        System.out.println("The perimeter of the rectangle is: " + rectangle.calculatePerimeter());

        System.out.print("Please enter the side of the square: ");
        Square square = new Square(scanner.nextDouble());
        System.out.println("The area of the square is: " + square.calculateArea() + " cm\u00B2");
        System.out.println("The perimeter of the square is: " + square.calculatePerimeter());

        System.out.print("Please enter the radius of the circle: ");
        Circle circle = new Circle(scanner.nextDouble());
        System.out.println("The area of the circle is: " + circle.calculateArea() + " cm\u00B2");
        System.out.println("The perimeter of the circle is: " + circle.calculatePerimeter());
    }

}
