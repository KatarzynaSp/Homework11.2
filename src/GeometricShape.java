abstract class GeometricShape extends Shape2D {
    Circle circle;
    Rectangle rectangle;

    public GeometricShape() {
    }

    public GeometricShape(Circle circle) {
        this.circle = circle;
    }

    public GeometricShape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
}
