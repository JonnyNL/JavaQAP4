package Problem1; // My Solutions to Problem 1 of QAP 4
// Abstract Shape Class
public abstract class Shape{
    // Protected instance variable for the given shapes name
    protected String name;

    // Constructor for a shape
    public Shape(String name) {
        this.name = name;
    }
    // abstract getters for perimeter and area of a shape
    public abstract double getPerimeter();
    public abstract double getArea();
    // gett for shape name
    public String getName() {
        return name;
    }
    // Shape to string
    @Override
    public String toString() {
        return String.format("Shape[type=%s, area=%.2f,perimeter=%.2f]|",
            name, getArea(), getPerimeter());
    }
}