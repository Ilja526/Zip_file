import java.io.*;
import java.util.zip.*;
public class Zip_archive{
    public static void main(String[] args){
        try(ZipInputStream zin = new ZipInputStream(new FileInputStream("C:/Users/Ilja/IdeaProjects/Zip/java4.zip"))){
            ZipEntry entry;
            String name;
            long size;
            while((entry=zin.getNextEntry())!=null){
                name = entry.getName();
                size=entry.getSize();
                System.out.printf("File name: %s \t File size: %d \n", name, size);

                FileOutputStream fout = new FileOutputStream("C:/Users/Ilja/IdeaProjects/Zip/Java4/new"+name);
                for (int c = zin.read(); c != -1; c = zin.read()){
                    fout.write(c);
                }
                fout.flush();
                zin.closeEntry();
                fout.close();
                    }
                }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        }