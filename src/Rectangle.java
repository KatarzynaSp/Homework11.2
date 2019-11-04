class Rectangle extends GeometricShape {
    private double lengthA;
    private double lengthB;

    public Rectangle(double lengthA, double lengthB) {
        this.lengthA = lengthA;
        this.lengthB = lengthB;
    }

    public double getLengthA() {
        return lengthA;
    }

    public void setLengthA(double lengthA) {
        this.lengthA = lengthA;
    }

    public double getLengthB() {
        return lengthB;
    }

    public void setLengthB(double lengthB) {
        this.lengthB = lengthB;
    }
}