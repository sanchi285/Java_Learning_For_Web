package Inheritance;

class Parent {

    public Parent(){
        System.out.println("I am parent");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("I am child");
    }
}
class GrandChild extends Child{
    public GrandChild(){
        System.out.println("I am grand child");
    }
}

class  TV{
    public void OnTv(){
        System.out.println("Tv is on");
    }

    public void changeChannel(){
        System.out.println("Channel is changing");
    }
}

class SmartTv extends TV{

    public void OnTv(){
        System.out.println("Smart Tv is on");
    }

    public void changeChannel(){
        System.out.println("Smart Tv Channel is changing");
    }

    public void Browse(){
        System.out.println("Browse Internet");
    }


}

public class InheritConstruct{

    public static void main(String[] args){

        GrandChild gc = new GrandChild();
        TV tv = new SmartTv();
        tv.OnTv();
        tv.changeChannel();

    }
}