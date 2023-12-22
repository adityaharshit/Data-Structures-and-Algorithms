import java.net.*;
import java.io.*;
class Server{
    public static void main(String[] args){
        boolean flag = true;
        ServerSocket ss =  new ServerSocket(4999);
        while(flag){
            Socket s = ss.accept();
            Process p = new Process(s);
            p.start();
        }
    }
}

class Process extends Thread{
    Socket s;
    Process(Socket s){
        this.s = s;
    }
    public void run(){
        try{
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = br.readLine();
            str = "Hello "+str;
            OutputStream os = s.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println(str);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}