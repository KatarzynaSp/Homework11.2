public abstract class Shape3D extends Shape {
    Ball ball;
    Cube cube;

    public Shape3D() {
    }

    public Shape3D(Ball ball) {
        this.ball = ball;
    }

    public Shape3D(Cube cube) {
        this.cube = cube;
    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Cube getCube() {
        return cube;
    }

    public void setCube(Cube cube) {
        this.cube = cube;
    }
}
