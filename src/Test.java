public class Test {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10);
        shapes[1] = new Cube(10);
        shapes[2] = new Line2D(1, 1, 2, 2);

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof GeometricShape) {
                GeometricShape geometricShape = (GeometricShape) shapes[i];
                System.out.println(shapeCalculator.shapeArea(geometricShape));
            } else if (shapes[i] instanceof Shape3D) {
                Shape3D shape3D = (Shape3D) shapes[i];
                System.out.println(shapeCalculator.volume(shape3D));
            } else if (shapes[i] instanceof Line2D) {
                Line2D line2D = (Line2D) shapes[i];
                System.out.println(shapeCalculator.lineLength(line2D));
            } else System.out.println("to ja już nie wiem co to ma być..");
        }
    }
}