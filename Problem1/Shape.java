package Problem1; // My Solutions to Problem 1 of QAP 4

public abstract class Shape{
    protected String name;


    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public String getName() {
        return name;
    }

    public String toString() {
        return String.format("Shape[type=%s, area=%f,perimeter=%f]|",
            name, getArea(), getPerimeter());
    }
}