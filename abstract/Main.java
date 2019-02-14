abstract class Animal {
    Animal() {
        System.out.println("Animal is created");
    }

    abstract void run();
}

class Cat extends Animal {
    @Override
    void run() {
        System.out.println("Cat is running");
    }
}

class Horse extends Animal {
    @Override
    void run() {
        System.out.println("Horse is running. It runs faster than cat");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Horse horse = new Horse();

        cat.run();
        horse.run();
    }
}