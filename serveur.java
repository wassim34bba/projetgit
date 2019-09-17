package chat_compris ;
import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class serveur{
    static Socket sock;
    static ServerSocket sv;
  public static void main (String [] args ) throws IOException {
        try {
            sv=new ServerSocket(60);
            Socket s=sv.accept();
            ObjectInputStream in=new ObjectInputStream(s.getInputStream());
            FileOutputStream out =new FileOutputStream(new File("C:\\Users\\ASUS\\Documents\\NetBeansProjects\\chat_compris\\src\\chat_compris\\a11111.txt"));
            byte buf[] = new byte[1024];
            int n;
            while((n=in.read(buf))!=-1){
                out.write(buf,0,n);                                        
            }
            out.close();                    
            sock.close();
        } catch (Exception ex) {}
    }
}