import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Copy_text{
    public static void main(String[] args){
        String source_file2="src"+File.separator+"Java"+File.separator+"java21.txt";
        String target_source2="src"+File.separator+"Java"+File.separator+"java22.txt";
        Path source_file=Paths.get(source_file2);
        Path target_source=Paths.get(target_source2);
        try{
            Files.copy(source_file, target_source);
        }
        catch(IOException ex3){
            ex3.printStackTrace();
        }
    }
}