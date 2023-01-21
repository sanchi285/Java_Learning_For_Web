package AbstructClass;


abstract class Shape{
    public abstract void perimeter();
    public abstract void area();
}

class Circle extends Shape{
    private double r;
    public Circle(double val){
            r = val;
        }
    @Override
    public void area() {
        System.out.println("The area is "+(Math.PI*r*r));
    }
    @Override
    public void perimeter() {
        System.out.println("The area is "+(2*Math.PI*r));
    }
}

class Rect extends Shape{
    private double w;
    private double l;

    public Rect(double val,double val2){
        w = val;
        l = val2;
    }
    @Override
    public void area() {
        System.out.println("The area is "+(w*l));
    }
    @Override
    public void perimeter() {
        System.out.println("The area is "+2*(l+w));
    }
}

public class Abstructexe {
    public static void main(String[] args){
        Shape shape = new Circle(4);
        shape.area();
        shape.perimeter();

        shape = new Rect(12,10);
        shape.area();
        shape.perimeter();

    }
}
