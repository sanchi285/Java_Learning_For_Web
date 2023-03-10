package javaiostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


class Customers{

    private static int id;
    private String cusId;
    private String name;
    private  String phone;

    public Customers(){

    }

    public Customers(String name, String phone){
        this.name = name;
        this.phone =phone;
        id++;
        this.cusId=Integer.toString(id);
    }

    @Override
    public String toString() {
        return name+" "+id+" "+phone+" \n";
    }
}

public class ChallengeDemo {

    static void part1(){
        try {
            float arr[] = {1.0f ,3.8f, 8.90f,3.45f};
            String path1 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/FloatSt.txt";
            FileOutputStream fos = new FileOutputStream(path1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(int i=0;i<arr.length;i++){
                oos.writeFloat(arr[i]);
            }
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(path1);
            ObjectInputStream ois = new ObjectInputStream(fis);

            for (int i=0;i<4;i++){
                System.out.println(ois.readFloat());
            }

            ois.close();
            fis.close();


        }
        catch (Exception e){

        }
    }

    public static void part2(){
        try{

            Customers arr[] = new Customers[3];
            String path1 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/CustoSt.txt";
            arr[0] =  new Customers("Ron","3455");
            arr[1] =  new Customers("Roni","999");
            arr[2] =  new Customers("Boni","95499");

            FileOutputStream fos = new FileOutputStream(path1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(int i=0;i<arr.length;i++){
                oos.writeObject(arr[i]);
            }

            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(path1);
            ObjectInputStream ois = new ObjectInputStream(fis);

            for (int i=0;i<arr.length;i++){
                Customers cs = (Customers)ois.readObject();
                System.out.println(cs.toString());
            }

            ois.close();
            fis.close();

        }
        catch (Exception e){
        }
    }
    public static void main(String[] args){

        part1();
        part2();
    }
}
