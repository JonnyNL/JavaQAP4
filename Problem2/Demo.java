package Problem2;

public class Demo {
    public static void main(String[] args) {
        // An array of now scalable shapes
        Scalable[] scalables = {
            new Circle(10),
            new Ellipse(10, 5),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(10)
        };
        // Print shapes before scaling
        System.out.println("Before scaling:");
        printAll(scalables);

        // Scale array of scalables by 2
        scaleAll(scalables, 2);
        // Print the scaled shapes
        System.out.println("After scaling:");
        printAll(scalables);
    }

    //static scaling function that takes an array of shapes based on a give scale, then scales
    public static void scaleAll(Scalable[] scalables, double scaleFactor) {
        for (Scalable scalable : scalables) {
            scalable.scale(scaleFactor);
        }
    }

    // static print function to clean up before and after scaling
    public static void printAll(Scalable[] scalables) {
        for (int i = 0; i < scalables.length; i++) {
            System.out.println("Shape #" + (i + 1));
            System.out.println(scalables[i]);
            System.out.println();
        }
    }
}
