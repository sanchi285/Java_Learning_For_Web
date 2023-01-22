package Interfaces;
interface Member{ void callback();}

class Customer implements Member{
    private String name;
    public Customer(String val){
        name = val;
    }

    @Override
    public void callback() {
        System.out.println("I will come "+name);
    }
}

class Store{
    Member mem[] = new Member[100];
    int count = 0;
    void register(Member m){
        mem[count] = m;
        count++;}
    void inviteSale(){
        for(int i=0;i<count;i++){
            mem[i].callback();
        }
    }
}
public class StudentChallenge {
    public static void  main(String[] args){
        Store s =  new Store();
        Customer c1 = new Customer("Johon");
        Customer c2 = new Customer("Smith");
        Customer c3 = new Customer("Willium");

        s.register(c1);
        s.register(c2);
        s.register(c3);
        s.inviteSale();

    }
}
