class Shape {
    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double circle(double radius) {
        return Math.PI * radius * radius;
    }
}

public class area_overload {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Area of square: " + shape.area(5));
        System.out.println("Area of rectangle: " + shape.area(10, 20));
        System.out.println("Area of circle: " + shape.circle(5.0));
    }
}