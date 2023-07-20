package Problem2;

public class Demo {
    public static void main(String[] args) {
        Scalable[] scalables = {
            new Circle(10),
            new Ellipse(10, 5),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(10)
        };

        System.out.println("Before scaling:");
        printAll(scalables);

        scaleAll(scalables, 2);

        System.out.println("After scaling:");
        printAll(scalables);
    }

    public static void scaleAll(Scalable[] scalables, double scaleFactor) {
        for (Scalable scalable : scalables) {
            scalable.scale(scaleFactor);
        }
    }

    public static void printAll(Scalable[] scalables) {
        for (int i = 0; i < scalables.length; i++) {
            System.out.println("Shape #" + (i + 1));
            System.out.println(scalables[i]);
            System.out.println();
        }
    }
}
