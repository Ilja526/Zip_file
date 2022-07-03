import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Source1{
    public static void main(String[] args){
        Path source_file = Paths.get("C:/Users/Ilja/IdeaProjects/Zip/java1.txt");
        Path target_source = Paths.get("C:/Users/Ilja/IdeaProjects/Zip/java2.txt");
        try {
            Files.copy(source_file, target_source);
        } catch (IOException ex3) {
            ex3.printStackTrace();
        }
    }
}
