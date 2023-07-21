package Problem2; // My Solutions to Problem 1 of QAP 4
// Implement scalable interface to super class
public abstract class Shape implements Scalable {
    // Protected instance variable for the given shapes name
    protected String name;

    // Constructor for a shape
    public Shape(String name) {
        this.name = name;
    }
    // abstract getters for perimeter and area of a shape
    public abstract double getPerimeter();
    public abstract double getArea();
    // getter for shape name
    public String getName() {
        return name;
    }

    // Shape to string
    @Override
public String toString() {
    return String.format("Shape[name=%s, area=%.2f,perimeter=%.2f]|",
        name, getArea(), getPerimeter());
}
}