package OOP.figure;

public class Circle extends Shape{
    public Circle(double a, double b, double c)
    {
        super(a,b,c);
    }

    @Override
    public double square() {
        return Math.PI*Math.pow(size,2);
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
