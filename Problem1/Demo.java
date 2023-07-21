package Problem1;

public class Demo {
    public static void main(String[] args) {
        // Create an array type shape of shapes
        Shape[] shapes = {
            new Circle(10),
            new Ellipse(10, 5),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(10)
        };

        // Loop through the array and print using the shape toString override method
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape #" + (i+1));
            System.out.println(shapes[i]);
            System.out.println();
        }
    }
}
