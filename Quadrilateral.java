// Class to represent a point in 2D space
class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    // Distance between two points
    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

// Base class: Quadrilateral
class Quadrilateral {
    protected Point p1, p2, p3, p4;

    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    // Display coordinates
    public void showCoordinates() {
        System.out.println("Points: (" + p1.getX() + "," + p1.getY() + ") "
                         + "(" + p2.getX() + "," + p2.getY() + ") "
                         + "(" + p3.getX() + "," + p3.getY() + ") "
                         + "(" + p4.getX() + "," + p4.getY() + ")");
    }
}

// Trapezoid (inherits Quadrilateral)
class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Approximate area calculation using average of parallel sides * height
    public double area() {
        double base1 = p1.distance(p2);
        double base2 = p3.distance(p4);
        double height = Math.abs(p1.getY() - p3.getY()); // assumes horizontal bases
        return 0.5 * (base1 + base2) * height;
    }
}

// Parallelogram
class Parallelogram extends Trapezoid {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double base = p1.distance(p2);
        double height = Math.abs(p1.getY() - p3.getY());
        return base * height;
    }
}

// Rectangle
class Rectangle extends Parallelogram {
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double length = p1.distance(p2);
        double width = p2.distance(p3);
        return length * width;
    }
}

// Square
class Square extends Rectangle {
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    @Override
    public double area() {
        double side = p1.distance(p2);
        return side * side;
    }
}

// Main class to test
public class ShapeHierarchy {
    public static void main(String[] args) {
        // Square with side = 2
        Square square = new Square(
            new Point(0, 0),
            new Point(2, 0),
            new Point(2, 2),
            new Point(0, 2)
        );

        // Rectangle 3x2
        Rectangle rect = new Rectangle(
            new Point(0, 0),
            new Point(3, 0),
            new Point(3, 2),
            new Point(0, 2)
        );

        // Parallelogram
        Parallelogram para = new Parallelogram(
            new Point(0, 0),
            new Point(4, 0),
            new Point(5, 2),
            new Point(1, 2)
        );

        // Trapezoid
        Trapezoid trap = new Trapezoid(
            new Point(0, 0),
            new Point(5, 0),
            new Point(4, 3),
            new Point(1, 3)
        );

        // Output areas
        System.out.println("Square area: " + square.area());
        System.out.println("Rectangle area: " + rect.area());
        System.out.println("Parallelogram area: " + para.area());
        System.out.println("Trapezoid area: " + trap.area());
    }
}
