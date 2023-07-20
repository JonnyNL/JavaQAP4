package Problem2; // My Solutions to Problem 1 of QAP 4

public abstract class Shape implements Scalable {
    protected String name;


    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();
    public abstract double getArea();

    public String getName() {
        return name;
    }

    @Override
public String toString() {
    return String.format("Shape[name=%s, area=%.2f,perimeter=%.2f]|",
        name, getArea(), getPerimeter());
}
}