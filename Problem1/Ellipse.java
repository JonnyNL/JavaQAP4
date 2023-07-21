package Problem1;

public class Ellipse extends Shape{
    // Private instance variables for the minor and major axis of an ellipse
    private double majorAxis;
    private double minorAxis;

    // Constructor for an Ellipse
    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);

    }
    
    // getter for an Ellipses Perimeter
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis) - Math.pow(majorAxis - minorAxis, 2) / 2);
    }

    // getter for an ellipses area
    public double getArea() {
        return Math.PI *majorAxis * minorAxis;
    }
}
