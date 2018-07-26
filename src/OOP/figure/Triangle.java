package OOP.figure;

public class Triangle extends Shape {
    public Triangle(double a, double b, double c)
    {
        super(a,b,c);
    }
    @Override
    public double square()
    {
        return  (Math.sqrt(3)/4)*Math.pow(size,2);
    }
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
