package Problem1;

public class Circle extends Shape {
    private double radius;

    // I don't think it' necessary to allow the user to rename a scientifically accurate circle so in this case I am 
    // setting the names by default.

    // Constructor for a circle
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    

    // Getter for a circles perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Getter for a circles area
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
