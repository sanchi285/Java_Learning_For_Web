package Static_Paractice;


import java.util.Date;

class Student{

    private static int Id_gen=1;
    private String id;
    private String assignId(){
        Date d = new Date();
        String rno = "Univ"+(d.getYear()+1900)+"-"+Id_gen;
        Id_gen++;
        return rno;
    }

    public String getId(){
        return  id;
    }

    Student(){
        id = assignId();
    }


}

public class Static_exe {
    public static void main(String[] args){
           Student [] class_room = new Student[10];
           for(int i=0;i<10;i++){class_room[i]=new Student();}
           for(int i=0;i<10;i++){
               System.out.println(class_room[i].getId());
           }
    }
}
