import java.io.File;
public class All_Files_in_katalog{
    public static void main(String[] args){
        String text_file="src"+File.separator+"Java";
        File source=new File(text_file);
        if(source.isDirectory()){
            for(File item:source.listFiles()){
                if(item.isDirectory()){
                    System.out.println(item.getName()+ " folder");
                }
                else{
                    System.out.println(item.getName()+"file");
                }
            }
        }
    }
}
