package assignments;

class ShapeClass {
    public void draw() {
        System.out.println("Drawing a Shape");
    }
}

class Circle extends ShapeClass {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends ShapeClass {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class Shape {
    public static void main(String[] args) {
    	ShapeClass shape1 = new Circle();
    	ShapeClass shape2 = new Rectangle();

        shape1.draw();
        shape2.draw();
    }
}
