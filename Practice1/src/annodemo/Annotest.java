package annodemo;


@interface MyAnno{
    String name();
    String project();
    String date();
    String version();

    String commit() default "None";
}

@MyAnno(name = "Sanchi", project = "testpro",date = "29Oct", version = "1.2.0")
public class Annotest {

    @MyAnno(name = "Sanchi", project = "testpro",date = "29Oct", version = "1.2.0")
    int data = 20;

    @MyAnno(name = "Sanchi", project = "testpro",date = "29Oct", version = "1.2.0")
    public static void main(String[] args){



    }

}
