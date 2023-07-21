package Problem2;


public class Circle extends Shape {
    // Private instance variable for the radius of a circle
    private double radius;

    // I don't think it' necessary to allow the user to rename a scientifically accurate circle so in this case I am setting the names by default.
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    
    // getter for a circles perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // getter for a circles area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override scale method for a circle
    @Override
    public void scale(double scaleFactor) {
        this.radius *= scaleFactor;
    }
}
