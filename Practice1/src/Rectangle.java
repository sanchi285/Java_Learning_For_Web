public class Rectangle {

    public double length;
    public double breath;

    public Rectangle(double len,double bre){
        this.length=len;
        this.breath = bre;
    }
    public double area(){return length*breath;}
    public double perimeter(){return 2*(length+breath);}

    public boolean isSquare(){return length==breath;}
}
