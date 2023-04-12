package CollectionsDemo;

import java.util.StringTokenizer;

public class StringTokenDemo {
    public static void main(String[] args){
        String data  = "name=Vijay;address=delhi;country=india;dept=cse";
        StringTokenizer stk = new StringTokenizer(data,"=;");
        String s;
        while (stk.hasMoreTokens()){
            s = stk.nextToken();
            System.out.println(s);
        }
    }
}
