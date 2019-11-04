class ShapeCalculator extends LineCalc implements Calc2D, Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        if (Circle.class.isInstance(shape)) {
            ((Circle) shape).getRadius();
            return 3.14 * Math.pow(((Circle) shape).getRadius(), 2) / 4;

        } else if (Rectangle.class.isInstance(shape)) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getLengthA() * rectangle.getLengthB();
        } else return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        if (Ball.class.isInstance(shape)) {
            ((Ball) shape).getRadius();
            return 4 / 3 * 3.14 * Math.pow(((Ball) shape).getRadius(), 3);
        } else if (Cube.class.isInstance(shape)) {
            Cube cube = (Cube) shape;
            return Math.pow(cube.getLengthA(), 3);
        } else return 0;
    }
}