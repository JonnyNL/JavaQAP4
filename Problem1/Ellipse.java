package Problem1;

public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        this.majorAxis = Math.max(majorAxis, minorAxis);
        this.minorAxis = Math.min(majorAxis, minorAxis);

    }
    
    public double getPerimeter() {
        return Math.PI * Math.sqrt(2 * (majorAxis * majorAxis + minorAxis * minorAxis) - Math.pow(majorAxis - minorAxis, 2) / 2);
    }

    public double getArea() {
        return Math.PI *majorAxis * minorAxis;
    }
}
