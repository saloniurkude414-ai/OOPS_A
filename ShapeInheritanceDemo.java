class ShapeBase {

    void display() {
        System.out.println("This is a shape.");
    }
}

class CircleShape extends ShapeBase {
    double radius = 5;

    void area() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class RectangleShape extends ShapeBase {
    double length = 4;
    double breadth = 6;

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

public class ShapeInheritanceDemo {

    public static void main(String[] args) {

        CircleShape c = new CircleShape();
        RectangleShape r = new RectangleShape();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}