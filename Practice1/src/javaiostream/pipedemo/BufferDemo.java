package javaiostream.pipedemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferDemo {
    public static void main(String[] str) throws Exception{
        String path = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Test.txt";
        FileInputStream fis = new FileInputStream(path);
        BufferedInputStream bis = new BufferedInputStream(fis);
        int x;
        /*
        while ((x=bis.read())!=-1){
            System.out.println((char)x);
        }
         */
        System.out.println("-------------------------------------------");
        //benifits of buffer
        System.out.println("Mark supported "+" "+ fis.markSupported());
        System.out.println("Mark supported "+" "+ bis.markSupported());
        //lets use this mark
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.mark(10);
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        bis.reset();
        System.out.print((char) bis.read());
        System.out.print((char) bis.read());
        /*Though file reader and stream (buffered are same) one is used for unicode and another for bytes*/
        return;
    }
}
