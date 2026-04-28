class Fruit {
    String name;

    Fruit(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

class Apple extends Fruit {
    Apple() {
        super("Apple");
    }
}

class Mango extends Fruit {
    Mango() {
        super("Mango");
    }
}

class FruitBox<T extends Fruit> {
    private java.util.List<T> fruits = new java.util.ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void displayFruits() {
        for (T f : fruits) {
            f.display();
        }
    }
}

class TestFruitBox {
    public static void main(String[] args) {
        FruitBox<Fruit> box = new FruitBox<>();
        box.addFruit(new Apple());
        box.addFruit(new Mango());

        box.displayFruits();

    }
}