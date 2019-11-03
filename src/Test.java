public class Test {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        LineCalc lineCalc = new LineCalc();

        Line2D line = new Line2D(4,5,4,5);
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(2, 5);
        Ball ball = new Ball(5);
        Cube cube = new Cube(10);


        System.out.println("Odcinek wyznaczony przez współrzędne [X1, Y1] [X2, Y2] ma długość " + lineCalc.lineLength(line));
        System.out.println("Koło o długości promienia wynoszącego R ma pole " + shapeCalculator.circleArea(circle) + "m2");
        System.out.println("Prostokąt o długościach boków A i B ma pole, które wynosi " + shapeCalculator.rectangleArea(rectangle) + "m2");
        System.out.println("Kula o długości promienia wynoszącego R ma pojemność " + shapeCalculator.ballVolume(ball) + " m3");
        System.out.println("Sześcian o długości krawędzi wynoszącej A ma pojemność " + shapeCalculator.cubeVolume(cube) + "m3");
    }
}
