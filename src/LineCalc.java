class LineCalc {

    double lineLength(Line2D line) {
        return Math.sqrt(Math.pow((line.getX2() - line.getX1()), 2) + Math.pow((line.getY2() - line.getY1()), 2));
    }
}
