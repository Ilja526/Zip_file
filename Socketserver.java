import java.net.*;
import java.io.*;
import java.io.InputStream;
public class Socketserver{
    private Socket sg;
    public void initServer(int port1){
        try{
              sg=new Socket(InetAddress.getLocalHost(), 9527);
        }
        catch(IOException ex9){
            ex9.printStackTrace();
        }
    }
    public void getFile(){
        byte[] b1=new byte[1024];
        try{
            InputStream ins=sg.getInputStream();
            DataInputStream din=new DataInputStream(new BufferedInputStream(ins));
            File fg=new File("java.txt");
            RandomAccessFile fw1=new RandomAccessFile(fg,"rw");
            int num=din.read(b1);
            while(num!=-1){
                fw1.write(b1,0,num);
                fw1.skipBytes(num);
                num=din.read(b1);
            }
            din.close();
            fw1.close();
        }
        catch(Exception ex10){
            ex10.printStackTrace();
        }
    }
    public static void main(String[] args){
        Socketserver sk1=new Socketserver();
        sk1.initServer(9527);
        sk1.getFile();
    }
}