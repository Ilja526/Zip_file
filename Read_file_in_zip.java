import java.io.*;
import java.util.zip.*;
class Read_file_in_zip{
    public static void main(String[] args){
        try(ZipInputStream zin=new ZipInputStream(new FileInputStream("Work"+File.separator+"Java.zip"))){
            ZipEntry entry;
            String name;
            long size;
            while((entry=zin.getNextEntry())!=null){
                name=entry.getName();  //получим название файла
                size=entry.getSize();  //получим его размер в байтах
                System.out.printf("File name: %s , File size: %d", name, size);

                FileOutputStream fout=new FileOutputStream("Work"+File.separator+"new "+name);
                for(int c=zin.read(); c!=-1; c=zin.read()){
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