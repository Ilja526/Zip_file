import java.io.*;
public class Main {
    public static void main(String[] args){
        String text="Labdien!Ka tevi sauc?";
        try(FileOutputStream fos=new FileOutputStream("C:/Users/Ilja/IdeaProjects/Zip/Java.txt")){
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}