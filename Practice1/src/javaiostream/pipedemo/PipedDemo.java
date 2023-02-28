package javaiostream.pipedemo;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os = o;
    }
    public void run(){
        int count1=1;
        while(true){
            try{
                os.write(count1);
                os.flush();
                System.out.println("Producer produced "+count1);
                System.out.flush();
                Thread.sleep(10);
                count1++;
            }catch (Exception e){}

        }
    }

}


class Consumer extends Thread{
     InputStream is;
    public Consumer(InputStream o){
        is = o;
    }
    public void run(){
        int count1=1;
        while(true){
            try{
                int x = is.read();
                System.out.println("Consumer consumed "+x);
                System.out.flush();
                count1++;
                Thread.sleep(10);
            }catch (Exception e){}

        }
    }

}


public class PipedDemo {
    public static void main(String[] args) throws Exception{

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pos.connect(pis);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();

        System.out.println("Pipe demo");
    }
}
