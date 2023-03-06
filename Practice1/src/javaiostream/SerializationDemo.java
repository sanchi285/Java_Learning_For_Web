package javaiostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Student{
    String str;
    int rool;
    double cgpa;
}

public class SerializationDemo {

    public static void main(String [] args) throws Exception{
        String path1 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Student1.txt";
        FileOutputStream fos = new FileOutputStream(path1);
        PrintStream ps = new PrintStream(fos);
        Student st  = new Student();
        st.str="Robi";
        st.rool=123;
        st.cgpa=3.21;
        ps.println(st.str);
        ps.println(st.rool);
        ps.println(st.cgpa);
        ps.close();
        fos.close();
        System.out.println("Done Serialization");
    }
}
