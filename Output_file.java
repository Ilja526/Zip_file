import java.io.*;
import java.util.zip.*;
public class Output_file{
    public static void main(String[] args) {
        String filename3="C:/Users/Ilja/IdeaProjects/Zip/java10.txt";
        try(ZipOutputStream zout=new ZipOutputStream(new FileOutputStream("C:/Users/Ilja/IdeaProjects/Zip/Java4"))){
            FileInputStream fis=new FileInputStream(filename3);
            ZipEntry entry1=new ZipEntry("java10.txt");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        }
        catch(Exception ex4){
            System.out.println(ex4.getMessage());
        }
    }
}
