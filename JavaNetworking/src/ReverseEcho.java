import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


class ServerResponse extends Thread{
    private Socket stk;
    public ServerResponse(Socket skt){this.stk=skt;}

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());
            String msg;
            StringBuilder sb;
            do
            {
                msg = br.readLine();
                sb=new StringBuilder(msg);
                sb.reverse();
                msg=sb.toString();
                ps.println(msg);
            }while (!msg.equals("dne"));
        }

        catch (Exception e){

        }
    }
}

public class ReverseEcho {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(2000);
        int count=0;
        while (true) {
            Socket stk = ss.accept();
            count++;
            System.out.println("Client count "+count);
            ServerResponse sr = new ServerResponse(stk);
            sr.start();
        }
    }
}


class Client {
    public static void main(String[] args) throws Exception{
        Socket stk;
        stk = new Socket("localhost",2000);
        BufferedReader keyb = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());
        String msg;

        do
        {
            msg = keyb.readLine();
            ps.println(msg);
            msg = br.readLine();
            System.out.println("Response from Server:"+msg);
        }while (!msg.equals("dne"));
    }
}
