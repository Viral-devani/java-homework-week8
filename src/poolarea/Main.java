package poolarea;

public class Main {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width="+rectangle.getWidth());
        System.out.println("rectangle.length="+rectangle.getLegnth());
        System.out.println("recltangle.are="+rectangle.getArea());
        Cuboid cuboid=new Cuboid(5,10,5);
        System.out.println("cuboid.width="+cuboid.getWidth());
        System.out.println("cuboid.length"+cuboid.getLegnth());
        System.out.println("cuboid.area"+cuboid.getArea());
    }
}
