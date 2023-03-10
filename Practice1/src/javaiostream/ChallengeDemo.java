package javaiostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ChallengeDemo {

    static void part1(){
        try {
            float arr[] = {1.0f ,3.8f, 8.90f};
            String path1 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/FloatSt.txt";
            FileOutputStream fos = new FileOutputStream(path1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for(int i=0;i<3;i++){
                oos.writeFloat(arr[i]);
            }
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream(path1);
            ObjectInputStream ois = new ObjectInputStream(fis);

            for (int i=0;i<3;i++){
                System.out.println(ois.readFloat());
            }

            ois.close();
            fis.close();


        }
        catch (Exception e){

        }
    }

    public static void main(String[] args){

        part1();

    }
}
