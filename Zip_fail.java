import java.io.*;
import java.util.zip.*;
public class Zip_fail{
    public static void main(String[] args){
        String filename="Work"+File.separator+"java7.txt";
        try(ZipOutputStream zout=new ZipOutputStream(new FileOutputStream("Work"+File.separator+ "Java.zip"))){
            FileInputStream fis=new FileInputStream(filename);
            ZipEntry entry1=new ZipEntry("java7.txt");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
            zout.close();
        }
        catch(Exception ex11){
            System.out.println(ex11.getMessage());
        }
    }
}
