package OOP.main;

import OOP.figure.Circle;
import OOP.figure.Rectangle;
import OOP.figure.Shape;
import OOP.figure.Triangle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        ArrayList<Shape> x = new ArrayList<>(10);
        System.out.println("10 shapes create");
        for (int i = 0; i < 10; i++) {
            int z = (int) (Math.random() * 3);
            switch (z) {
                case 0:
                    x.add(new Rectangle(Math.random() * 100, Math.random() * 100, Math.random() * 100));
                    break;
                case 1:
                    x.add(new Circle(Math.random() * 100, Math.random() * 100, Math.random() * 100));
                    break;
                case 2:
                    x.add(new Triangle(Math.random() * 100, Math.random() * 100, Math.random() * 100));
                    break;
            }
        }
        for (Shape figure : x) {
            System.out.println(figure.square());
        }
        System.out.println("Are created " + x.size() + " shapes" );
        System.out.println("Change value by coefficient:");
        for (int i = 0; i < x.size(); i++) {
            Shape z = x.get(i);
            z.change(Math.random() * 1);
            x.set(i, z);
        }
        for (Shape figure : x) {
            System.out.println(figure.square());
            System.out.println(figure);
        }
        System.out.println("Sorted");
        for (int i = 0; i < x.size(); i++) {
            for (int j = 0; j < x.size() - i - 1; j++) {
                if (x.get(j).square() > x.get(j + 1).square()) {
                    Shape f = x.get(j);
                    x.set(j, x.get(j + 1));
                    x.set(j + 1, f);
                }
            }
        }
        System.out.println("`````````");
        for (Shape figure : x) {
            System.out.println(figure.square());
        }
    }
}
