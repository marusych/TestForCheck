package OOP.figure;

public abstract class Shape {
    double positionX;
    double positionY;
    double size;

    public Shape(double pozitionX, double pozitionY, double size){
        this.positionX=pozitionX;
        this.positionY=pozitionY;
        this.size=size;
    }

    public abstract void replace(double pozitionX, double pozitionY);
    public abstract double square();
    public abstract double change( double size);
}
