package OOP.figure;

public class Rectangle extends Shape {
    public Rectangle(double a, double b, double c)
    {
        super(a,b,c);
    }
    @Override
    public double square() {
        return size*size;
    }
    @Override
    public void replace(double a, double b) {
        positionX=a;
        positionY=b;
    }

    public double change(double coefficient)
    {
        size*=coefficient;

        return size;
    }
}
