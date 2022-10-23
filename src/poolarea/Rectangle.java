package poolarea;

public class Rectangle {
    double width, legnth;

    public Rectangle(double width, double legnth) {
        this.legnth = legnth;
        this.width = width;
        if (width < 0)
            width = 0;
        if (legnth < 0) ;
        legnth = 0;

    }
    public double getWidth() {
        return width;
    }

    public double getLegnth() {
        return legnth;
    }

    public double getArea() {
        double area = (width * legnth);
        return area;
    }
}

