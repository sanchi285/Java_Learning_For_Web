package multithread;

class Sand{

    private int d;
    public int c;
    boolean monitor;


    public Sand(){
        c = 0;
        monitor=true;
    }

    synchronized public void setd(int v){

        try {

            while (monitor==false){wait();}
            monitor=false;
            d=v;
            System.out.println("Set value "+v);
            notify();
        }

        catch (Exception e) {

        }
    }

    synchronized public int getd(){

        try {

            while (monitor==true){wait();}
            monitor=true;
            notify();
            return d;

        }

        catch (Exception e) {

        }

        return d;
    }


}


class SanProd extends Thread{

    Sand ms;

    public SanProd(Sand ms){
        this.ms = ms;
    }

    public void run(){
        while (true){
            ms.c++;
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){}

            ms.setd(ms.c);
        }
    }

}


class SanConsume extends Thread{

    Sand ms;
    public SanConsume(Sand ms){
        this.ms = ms;
    }

    public void run(){
        while (true){
            System.out.println("Consumed "+ms.getd());
        }
    }

}


public class MyPcDemo {
    public static void main(String[] args){
        Sand d = new Sand();
        SanProd sp = new SanProd(d);
        SanConsume sc= new SanConsume(d);
        System.out.println("start");
        sp.start();
        sc.start();


    }
}
