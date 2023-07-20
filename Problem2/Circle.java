package Problem2;


public class Circle extends Shape {
    private double radius;

    // I don't think it' necessary to allow the user to rename a scientifically accurate circle so in this case I am setting the names by default.
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }
    
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void scale(double scaleFactor) {
        this.radius *= scaleFactor;
    }
}
