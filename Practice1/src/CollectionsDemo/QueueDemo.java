package CollectionsDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(21);
        queue.add(56);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.poll();
        }

    }
}
