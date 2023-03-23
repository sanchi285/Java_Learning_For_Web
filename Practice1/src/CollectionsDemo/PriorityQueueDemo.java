package CollectionsDemo;

import java.util.Comparator;
import java.util.PriorityQueue;

class Point implements Comparable {
    private int a;
    private int b;
    public Point(int a, int b){
        this.a =a;
        this.b=b;
    }
    public void show(){
        System.out.println(a+" "+b);
    }

    @Override
    public int compareTo(Object t1) {
        Point p = (Point) t1;
        if(this.a<p.a){ return -1;}
        else if(this.a>p.a){ return 1;}
        else if(this.b<p.b){ return -1;}
        else if(this.b>p.b){ return 1;}
        return 0;
    }
}


public class PriorityQueueDemo {
    public static void main(String[] str){

        PriorityQueue<Point> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Point(12,12));
        priorityQueue.add(new Point(1,2));
        priorityQueue.add(new Point(1,7));
        priorityQueue.add(new Point(12,7));
        while (!priorityQueue.isEmpty()){
            priorityQueue.peek().show();
            priorityQueue.poll();
        }
    }
}
