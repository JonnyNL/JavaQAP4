package Problem1;

public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(10),
            new Ellipse(10, 5),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(10)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape #" + (i+1));
            System.out.println(shapes[i]);
            System.out.println();
        }
    }
}
