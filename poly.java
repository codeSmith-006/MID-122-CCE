
Question 1

Write a console-based program to implement polymorphism using inheritance. Consider the example of Shape as base class with method show(). Then create child classes Circle and Rectangle which override the method show(). Add one more method getInfo(). This method should display the class name in which it is implemented. Do not override this method. When you call getInfo() with a child object, it should still show the name of the base class.

✅ Java Program
// Q1: Polymorphism with Shape, Circle, Rectangle

class Shape {
    public void show() {
        System.out.println("This is a Shape.");
    }

    public void getInfo() {
        System.out.println("Class Name: Shape");
    }
}

class Circle extends Shape {
    @Override
    public void show() {
        System.out.println("This is a Circle.");
    }
}

class Rectangle extends Shape {
    @Override
    public void show() {
        System.out.println("This is a Rectangle.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.show();
        s1.getInfo();

        s2.show();
        s2.getInfo();
    }
}

Question 2

Write a subclass called SubClass derived from SuperClass. It should add an integer field data2 and a method checkCondition() that returns "Condition True!" if data1 == 10 && data2 == 15. Also, create setData2(), getData2(), and a constructor to initialize data1 and data2.

✅ Java Program
// Q2: SubClass and SuperClass

class SuperClass {
    protected int data1;

    public SuperClass(int data1) {
        this.data1 = data1;
    }

    public int getData1() {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }
}

class SubClass extends SuperClass {
    private int data2;

    public SubClass(int data1, int data2) {
        super(data1);
        this.data2 = data2;
    }

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }

    public String checkCondition() {
        if (data1 == 10 && data2 == 15) {
            return "Condition True!";
        } else {
            return "Condition False!";
        }
    }
}

public class TestSubClass {
    public static void main(String[] args) {
        SubClass obj = new SubClass(10, 15);
        System.out.println("Data1: " + obj.getData1());
        System.out.println("Data2: " + obj.getData2());
        System.out.println(obj.checkCondition());
    }
}

Question 3

Create a class Pizza that stores information about a pizza (size, cheese toppings, pepperoni toppings, ham toppings). Add methods:

calcCost() → returns total pizza cost.

getDescription() → returns pizza details.
Then create PizzaOrder class that allows up to 3 pizzas in an order and a method calcTotal() that returns total order cost.

✅ Java Program
// Q3: Pizza and PizzaOrder

class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    public double calcCost() {
        int basePrice = 0;
        if (size.equalsIgnoreCase("small")) {
            basePrice = 10;
        } else if (size.equalsIgnoreCase("medium")) {
            basePrice = 12;
        } else if (size.equalsIgnoreCase("large")) {
            basePrice = 14;
        }
        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        return basePrice + (2 * totalToppings);
    }

    public String getDescription() {
        return size + " pizza with " + cheeseToppings + " cheese, " +
               pepperoniToppings + " pepperoni, " + hamToppings + " ham toppings. " +
               "Cost: $" + calcCost();
    }
}

class PizzaOrder {
    private Pizza[] pizzas = new Pizza[3];
    private int count = 0;

    public void addPizza(Pizza p) {
        if (count < 3) {
            pizzas[count] = p;
            count++;
        } else {
            System.out.println("Cannot add more than 3 pizzas!");
        }
    }

    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += pizzas[i].calcCost();
        }
        return total;
    }
}

public class PizzaTest {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("large", 1, 1, 2);
        Pizza p2 = new Pizza("medium", 2, 0, 1);

        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());

        PizzaOrder order = new PizzaOrder();
        order.addPizza(p1);
        order.addPizza(p2);

        System.out.println("Total Order Cost: $" + order.calcTotal());
    }
}
