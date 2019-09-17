package chat_compris ;
import java.net.*;
import java.io.*;
 
public class client {
    static Socket s;
  public static void main (String [] args ) throws IOException
  {
                s=new Socket("127.0.0.1",60);
                FileInputStream inf=new FileInputStream(new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\chat_compris\\src\\chat_compris\\f.txt"));
        ObjectOutputStream out=new ObjectOutputStream(s.getOutputStream());               
                byte buf[] = new byte[1024];
                int n;                   
                while((n=inf.read(buf))!=-1){
                   out.write(buf,0,n);                   
                }           
                inf.close();
                out.close();   
                s.close(); 
  }
}