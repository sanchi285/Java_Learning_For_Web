package functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {

    public static  void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(32);
        list.add(33);
        list.add(83);
        list.add(232);

        printEvenInlistFunctional(list);
        System.out.println("\n");
        printOddInlistFunctional(list);
        List<String >str = List.of("Spring",
                "Spring Boot","Docker",
                        "API","Microservice","AWS","Spring Cloud","Azure");
        stringFiltering(str);
        System.out.println("\n");
        stringFilteringMoreThan4(str);

    }

    private static void printEvenInlistFunctional(List<Integer> numbers){
        numbers.stream()
                .filter((num)->num%2==0)
                .forEach(System.out :: println);
    }

    private static void printOddInlistFunctional(List<Integer> numbers){
        numbers.stream()
                .filter((num)->num%2!=0)
                .forEach(System.out :: println);
    }

    private static void stringFiltering(List<String> strings){
        strings.stream()
                .filter((str)-> str.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void stringFilteringMoreThan4(List<String> strings){
        strings.stream()
                .filter((str)-> str.length()>=4)
                .forEach(System.out::println);
    }
}
