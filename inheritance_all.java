1.
Question:
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call:

Method of parent class by object of parent class

Method of child class by object of child class

Method of parent class by object of child class

Expected Output:

python
Copy code
This is parent class
This is child class
This is parent class
Solution:

java
Copy code
class Parent {
    public void parentMethod() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("This is child class");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.parentMethod();
        child.childMethod();
        child.parentMethod();
    }
}
2.
Question:
In the above example, declare the method of the parent class as private and then repeat the first two operations. You will get an error in the third.

Solution:

java
Copy code
class ParentPrivate {
    private void parentMethod() {
        System.out.println("This is parent class");
    }

    public void callParentMethod() {
        parentMethod();
    }
}

class ChildPrivate extends ParentPrivate {
    public void childMethod() {
        System.out.println("This is child class");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        ParentPrivate parent = new ParentPrivate();
        ChildPrivate child = new ChildPrivate();

        parent.callParentMethod();
        child.childMethod();

        // child.parentMethod();  // ERROR: private access
    }
}
Output:

python
Copy code
This is parent class
This is child class
3.
Question:
Create a class named Member having the following members:

Name

Age

Phone number

Address

Salary

It also has a method named printSalary which prints the salary.

Two classes Employee and Manager inherit the Member class.
Assign values to both Employee and Manager objects and print them.

Expected Output:

yaml
Copy code
---- Employee Details ----
Name: Alice
Age: 28
Phone Number: 0123456789
Address: 123 Main Street
Specialization: Software Development
Salary: 50000.0
---- Manager Details ----
Name: Bob
Age: 40
Phone Number: 0987654321
Address: 456 Office Avenue
Department: IT Operations
Salary: 80000.0
Solution:

java
Copy code
class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class Problem3 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Alice";
        emp.age = 28;
        emp.phoneNumber = "0123456789";
        emp.address = "123 Main Street";
        emp.specialization = "Software Development";
        emp.salary = 50000.0;

        Manager mgr = new Manager();
        mgr.name = "Bob";
        mgr.age = 40;
        mgr.phoneNumber = "0987654321";
        mgr.address = "456 Office Avenue";
        mgr.department = "IT Operations";
        mgr.salary = 80000.0;

        System.out.println("---- Employee Details ----");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        System.out.println("Specialization: " + emp.specialization);
        emp.printSalary();

        System.out.println("---- Manager Details ----");
        System.out.println("Name: " + mgr.name);
        System.out.println("Age: " + mgr.age);
        System.out.println("Phone Number: " + mgr.phoneNumber);
        System.out.println("Address: " + mgr.address);
        System.out.println("Department: " + mgr.department);
        mgr.printSalary();
    }
}
4.
Question:
Create a class Rectangle with length and breadth, and methods for area and perimeter.
A Square class inherits Rectangle with constructor super(s, s).

Expected Output:

mathematica
Copy code
Area of Rectangle: 15
Perimeter of Rectangle: 16
Area of Square: 16
Perimeter of Square: 16
Solution:

java
Copy code
class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        Square sq = new Square(4);

        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.perimeter());
        System.out.println("Area of Square: " + sq.area());
        System.out.println("Perimeter of Square: " + sq.perimeter());
    }
}
5.
Question:
Print the area of 15 squares using array of objects.
Then take input from keyboard for 15 sides and print their areas.

Expected Output (first part):

mathematica
Copy code
Square 1 - Area of Square: 1
Square 2 - Area of Square: 4
...
Square 15 - Area of Square: 225
Solution:

java
Copy code
import java.util.Scanner;

class Square5 {
    private int side;
    public Square5(int side) {
        this.side = side;
    }
    public int area() {
        return side * side;
    }
}

public class Problem5 {
    public static void main(String[] args) {
        // Part A: Predefined sides (1..15)
        Square5[] squares = new Square5[15];
        for (int i = 0; i < 15; i++) {
            squares[i] = new Square5(i + 1);
        }
        for (int i = 0; i < squares.length; i++) {
            System.out.println("Square " + (i + 1) + " - Area of Square: " + squares[i].area());
        }

        // Part B: User input
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter 15 integer side values:");
        Square5[] userSquares = new Square5[15];
        for (int i = 0; i < 15; i++) {
            int side = sc.nextInt();
            userSquares[i] = new Square5(side);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Square " + (i + 1) + " - Area of Square: " + userSquares[i].area());
        }
        sc.close();
    }
}
6.
Question:
Create a Shape class with method "This is shape".
Rectangle and Circle inherit it.
Square extends Rectangle.
Call Shape and Rectangle methods using a Square object.

Expected Output:

csharp
Copy code
This is shape
This is rectangular shape
Solution:

java
Copy code
class Shape {
    public void showShape() {
        System.out.println("This is shape");
    }
}

class Rectangle6 extends Shape {
    public void showRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle6 extends Shape {
    public void showCircle() {
        System.out.println("This is circular shape");
    }
}

class Square6 extends Rectangle6 {
    public void showSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Square6 sq = new Square6();
        sq.showShape();
        sq.showRectangle();
    }
}
7.
Question:
Write an inheritance hierarchy:
Quadrilateral → Trapezoid → Parallelogram → Rectangle → Square.
Use a Point class to represent vertices.
Quadrilateral stores 4 points privately.
Calculate area (except for Quadrilateral).

Expected Output:

mathematica
Copy code
Trapezoid Area: 24.00
Parallelogram Area: 20.00
Rectangle Area: 12.00
Square Area: 4.00
Solution:

java
Copy code
class Point {
    public final double x, y;
    public Point(double x, double y) { this.x = x; this.y = y; }
}

class Quadrilateral {
    private final Point p1, p2, p3, p4;
    public Quadrilateral(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1; this.p2 = p2; this.p3 = p3; this.p4 = p4;
    }
    protected double polygonArea() {
        double sum1 = p1.x * p2.y + p2.x * p3.y + p3.x * p4.y + p4.x * p1.y;
        double sum2 = p1.y * p2.x + p2.y * p3.x + p3.y * p4.x + p4.y * p1.x;
        return Math.abs(sum1 - sum2) / 2.0;
    }
}

class Trapezoid extends Quadrilateral {
    public Trapezoid(Point p1, Point p2, Point p3, Point p4) { super(p1, p2, p3, p4); }
    public double area() { return polygonArea(); }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(Point p1, Point p2, Point p3, Point p4) { super(p1, p2, p3, p4); }
    public double area() { return polygonArea(); }
}

class RectangleQ extends Parallelogram {
    public RectangleQ(Point p1, Point p2, Point p3, Point p4) { super(p1, p2, p3, p4); }
    public double area() { return polygonArea(); }
}

class SquareQ extends RectangleQ {
    public SquareQ(Point p1, Point p2, Point p3, Point p4) { super(p1, p2, p3, p4); }
    public double area() { return polygonArea(); }
}

public class Problem7 {
    public static void main(String[] args) {
        Trapezoid t = new Trapezoid(new Point(0, 0), new Point(8, 0), new Point(6, 4), new Point(2, 4));
        Parallelogram p = new Parallelogram(new Point(0, 0), new Point(5, 0), new Point(7, 4), new Point(2, 4));
        RectangleQ r = new RectangleQ(new Point(0, 0), new Point(4, 0), new Point(4, 3), new Point(0, 3));
        SquareQ s = new SquareQ(new Point(0, 0), new Point(2, 0), new Point(2, 2), new Point(0, 2));

        System.out.printf("Trapezoid Area: %.2f%n", t.area());
        System.out.printf("Parallelogram Area: %.2f%n", p.area());
        System.out.printf("Rectangle Area: %.2f%n", r.area());
        System.out.printf("Square Area: %.2f%n", s.area());
    }
}
