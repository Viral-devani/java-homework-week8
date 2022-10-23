package program19cylinder;

public class Cylinder extends Circle {
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getvolume() {

        double volume = super.getArea() * this.height;
        return volume;

    }
}


