package classWorks;

public class circle extends abstractFigure {


    private point p1;
    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public point getP1() {
        return p1;
    }


    public void setP1(point p1) {
        this.p1 = p1;
    }


    @Override
    public double area() {
        return 3.14*getRadius()*getRadius();
    }
}
