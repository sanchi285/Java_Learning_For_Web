package javaiostream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.SequenceInputStream;


public class CopyPasteDemo {

    public static void FileWriting(String path,String str) throws Exception{
        //String path = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Test.txt";
        try (FileOutputStream fos = new FileOutputStream(path)){
            fos.write(str.getBytes());
        }
    }

    public static String FileReading(String path) throws Exception{
        try (FileInputStream fis = new FileInputStream(path)){
            byte b[] = new byte[fis.available()];
            fis.read(b);
            String res = new String(b);
            return  res;
        }
    }

    public static void Appendtwo(String path1,String path2, String path3) throws Exception{

        try(FileInputStream fos1 = new FileInputStream(path1);
            FileInputStream fos2 = new FileInputStream(path2);
            FileOutputStream fos3 = new FileOutputStream(path3)) {

            SequenceInputStream sqit = new SequenceInputStream(fos1,fos2);
            //byte b[] = new byte[sqit.available()];
            int b;
            while((b=sqit.read())!=-1){
                System.out.print((char)b);
                fos3.write(b);
            }

        }


    }


    public static void main(String[] args) throws Exception{
        String path1 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Source1.txt";
        String path2 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Source2.txt";
        String path3 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Source3.txt";

        try {
            FileWriting(path1,"HELLO MY JAVA\nLOL\nCOOL\n");
            String res = FileReading(path1).toLowerCase();
            FileWriting(path2,res);
            //append form both of these file using sequence input stream
            Appendtwo(path1,path2,path3);
        }

        catch (Exception e){

        }
    }
}
