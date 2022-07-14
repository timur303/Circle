package HomeWork;

public class Circle {
    private double radius;
    private final double PI = 3.14;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {

        return PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * PI * this.radius;

    }

}