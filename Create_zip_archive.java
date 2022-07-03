import java.io.*;
import java.util.zip.*;
public class Create_zip_archive{
    public static void main(String[] args) {
        String filename = "C:/Users/Ilja/IdeaProjects/Zip/java4.zip";
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:/Users/Ilja/IdeaProjects/Zip/out"));
            FileInputStream fis= new FileInputStream(filename);){
            ZipEntry entry1=new ZipEntry("java20.txt");
            zout.putNextEntry(entry1);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            zout.write(buffer);
            zout.closeEntry();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}