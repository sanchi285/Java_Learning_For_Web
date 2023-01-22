package Interfaces;

class Phone{
    void call(){System.out.println("phone is calling");}
    void sms(){ System.out.println("Phone is Smsing");}
}

interface ICamera{
    void play();
    void pause();
    void stop();
}

interface IMultiplayer{
    void click();
    void record();
}

class Smartphone extends Phone implements ICamera,IMultiplayer{

    @Override
    public void click() {System.out.println("Smart Phone Camera is clicking");}
    @Override
    public void record() {System.out.println("Smart Phone Camera is recording");}
    @Override
    public void play() {System.out.println("Smart Phone Player is playing");}
    @Override
    public void pause()  {System.out.println("Smart Phone Player is pause");}
    @Override
    public void stop() {System.out.println("Smart Phone Player is stop");}
}

public class InterfaceExample {
    public static void main(String[] args){
        Smartphone s = new Smartphone();
        Phone p = s;
        ICamera c = s;
        IMultiplayer m = s;
    }
}
