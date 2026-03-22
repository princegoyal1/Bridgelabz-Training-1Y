interface Taxable {
    double calculateTax();
}

abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    abstract double calculateDiscount();
}

// Electronics
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }
}

// Clothing
class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return getPrice() * 0.20;
    }
}

// Main
class Main2 {
    public static void main(String[] args) {
        Product p = new Electronics(1, "Laptop", 50000);

        double finalPrice = p.getPrice() - p.calculateDiscount();
        System.out.println("Final Price: " + finalPrice);
    }
}