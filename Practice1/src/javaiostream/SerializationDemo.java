package javaiostream;

import java.io.*;

class Student implements Serializable {
    String str;
    int rool;
    double cgpa;
}

public class SerializationDemo {

    public static void main(String [] args) throws Exception{
        String path1 = "/home/sanchi/learning/Java_Learning_web/Java_Learning_For_Web/Student1.txt";
        FileOutputStream fos = new FileOutputStream(path1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Student st  = new Student();
        st.str="Robi";
        st.rool=123;
        st.cgpa=3.21;
        oos.writeObject(st);
        oos.close();
        fos.close();
        System.out.println("Done Serialization");
    }
}
