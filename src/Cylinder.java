public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return  Math.round((2 * super.getArea() + super.getPerimeter() * height) * 100) / 100.0;
    }

    public double getVolume() {
        return Math.round((super.getArea() * height) * 100) / 100.0;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height = " + height +
                " radius = " + super.getRadius() +
                ", color = '" + super.getColor() + '\'' +
                ", area = " + this.getArea() +
                ", perimeter = " + super.getPerimeter() +
                ", volume = " + this.getVolume() +
                '}';
    }
}
