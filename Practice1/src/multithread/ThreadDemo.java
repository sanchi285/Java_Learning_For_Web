package multithread;


class MyData{

     synchronized public void display(String str){

            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));

                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
            }
            System.out.println("");

    }

}

class MyThread1 extends Thread{

    MyData d;
    public MyThread1(MyData d){
        this.d = d;
    }

    public void run(){
        d.display("Hello World");
    }

}


class MyThread2 extends Thread{

    MyData d;
    public MyThread2(MyData d){
        this.d = d;
    }

    public void run(){
        d.display("Hello Mr Sanchi");
    }

}


public class ThreadDemo {
    public static void main(String[] args){
        MyData md = new MyData();
        Thread t1 = new MyThread1(md);
        Thread t2 = new MyThread2(md);

        t1.start();
        t2.start();

    }
}
