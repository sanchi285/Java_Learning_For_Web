package javaiostream;

import java.io.FileOutputStream;
import java.io.Writer;

public class FileExample {

    public static void main(String[] args){
        String path = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Test.txt";
        try {
            FileOutputStream fos = new FileOutputStream(path);
            String str  = "Learn Java Programming";
            fos.write(str.getBytes());
            fos.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
