class Circle {

    double radius;

    Circle() {
        this(5); 
    }

    Circle(double r) {
        radius = r;
    }

    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(7);

        c1.displayArea();
        System.out.println();
        c2.displayArea();
    }
}