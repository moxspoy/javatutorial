
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Using class interface referencee");
        Shape rect = new Rectangle();
        rect.draw();
    
        System.out.println("\nUsing class type referencee");
        Triangle triangle = new Triangle();
        triangle.draw();
    }
}