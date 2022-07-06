import java.io.*;
public class File_txt {
    public static void main(String[] args){
        String file="src"+File.separator+"Java.txt";
        try(FileInputStream fin=new FileInputStream(file)){
            System.out.printf("File size: %d bytes \n", fin.available());
            int number=-1;
            while((number=fin.read())!=-1){
                System.out.print((char)number);
            }
        }
        catch(IOException ex1){
            System.out.println(ex1.getMessage());
        }
    }
}