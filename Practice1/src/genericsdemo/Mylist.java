package genericsdemo;

public class Mylist <T> {
    public T val;
    Mylist  head;
    Mylist  tail;

    public Mylist(){
        head=null;
        tail=null;
    }

    public void add(T val){
        if(head==null){
           // this.val = val;
            this.head = new Mylist();
            this.head.val =val;
            this.tail = head;
        }

        else {
            this.tail.tail = new Mylist();
            this.tail.tail.val = val;
            this.tail = this.tail.tail;
        }
    }

    public void show(){
        Mylist mt = head;
        while (mt!=null) {
            System.out.println(mt.val);
            mt=mt.tail;
        }
    }

}
