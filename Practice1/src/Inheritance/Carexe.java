package Inheritance;

class Car {
    public void start() {
        System.out.println("Car is starting");
    }
    public void accelerate() {
        System.out.println("Car is Accelarating");
    }
    public void changeGear() {System.out.println("Gear is changing");}
}

class Luxarycar extends Car{

    @Override
    public void changeGear() {
        System.out.println("Luxary car gear is changing");
    }

    public void roofOpen(){
        System.out.println("Roof is opening");
    }
}

public class Carexe {
    public static void main(String[] args){

        Luxarycar luxarycar = new Luxarycar();
        luxarycar.start();
        luxarycar.accelerate();
        luxarycar.changeGear();
        luxarycar.roofOpen();

    }
}
