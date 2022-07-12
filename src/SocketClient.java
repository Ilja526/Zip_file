import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class SocketClient{
    private Socket client;
    public void connectSocketServer(int port){
        try{
            ServerSocket server=new ServerSocket(port);
            client=server.accept();
        }
        catch(Exception ex5){
            ex5.printStackTrace();
        }
    }
    public void sendFile(String str){
        byte[] b=new byte[1024];
        File s=new File(str);
        try{
            OutputStream dout=new DataOutputStream(new BufferedOutputStream(client.getOutputStream()));
            InputStream in=new FileInputStream(s);
            int n=in.read(b);
            while(n!=-1){
                dout.write(b);
                dout.flush();
                n=in.read(b);
            }
        }
        catch(IOException ex7){
            ex7.printStackTrace();
        }
    }
    public static void main(String[] args){
        SocketClient nh=new SocketClient();
        nh.connectSocketServer(9527);
        nh.sendFile("java.txt");
    }
}