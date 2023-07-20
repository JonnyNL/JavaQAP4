package Problem2;

public class Triangle extends Shape{
    // Private instance variables for 3 sides of a triangle
    private double side1;
    private double side2;
    private double side3;

    // Triangle constructor that takes
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if(!isValidTriangle(side1, side2, side3)) {
            System.out.println("Error: Invalid triangle. The sum of two sides must be greater than the third.");
            System.exit(1);
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && b + c > a && c + a > b;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double s = (side1 +side2 + side3);
        return Math.sqrt(s * (s- side1) * (s - side2) *(s - side3));
    }

    @Override
public void scale(double scaleFactor) {
    this.side1 *= scaleFactor;
    this.side2 *= scaleFactor;
    this.side3 *= scaleFactor;
}
}
