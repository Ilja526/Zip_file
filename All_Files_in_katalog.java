import java.io.File;
public class All_Files_in_katalog{
    public static void main(String[] args){
        String text_file="Work"+File.separator+"Projects";
        File source=new File(text_file);
        if(source.isDirectory()){
            for(File item:source.listFiles()){
                if(source.isDirectory()){
                    System.out.println(item.getParent()+" folder");
                    System.out.println(item.getName()+" file");
                }
            }
        }
    }
}