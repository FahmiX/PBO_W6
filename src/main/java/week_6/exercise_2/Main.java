
package week_6.exercise_2;

import week_6.exercise_2.Shape;

public class Main {

    public static void main(String[] args) {
        Shape a = new Shape();
        System.out.println(a.toString());
        Circle b = new Circle(5, "Red", true);
        System.out.println(b.toString());
        Rectangle c = new Rectangle(10, 15, "Blue", true);
        System.out.println(c.toString());
        Square d = new Square(15, "Green", false);
        System.out.println(d.toString());
    }
}
