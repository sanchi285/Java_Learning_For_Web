package javaiostream;
import java.io.*;
public class RandomAccessFileDemo {
    public static void main(String[] args) throws Exception{
        String path = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Test.txt";
        RandomAccessFile rf = new RandomAccessFile(path,"rw");
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('*');
        System.out.println((char)rf.read());
        rf.skipBytes(3);
        System.out.println((char)rf.read());

    }
}
