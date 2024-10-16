//    UML
//    Circle
//    ----------
//    + radius: double
//    + color: String
//    ----------
//    Circle()
//    Circle(double, String)
//    getRadius(): double
//    setRadius(double): double
//    getColor(): Strong
//    setColor(String): String
//    getArea(): double
//    getPerimeter(): double
//    toString(): void

public class Circle {
    private double radius;
    private String color;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.round((radius * radius * Math.PI) * 100) /100.0;
    }

    public double getPerimeter() {
        return Math.round((2 * Math.PI * radius) * 100) /100.0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color = '" + color + '\'' +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
