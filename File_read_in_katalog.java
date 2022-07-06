import java.io.File;
public class File_read_in_katalog{
    public static void main(String[] args){
        String pathFile="src"+File.separator+"Java"+File.separator+"java.txt";
        File myFile=new File(pathFile);
        System.out.println("File name "+myFile.getName());
        System.out.println("Parent floder "+ myFile.getParent());
        if(myFile.exists()){
            System.out.println("File exsistes");
        }
        else{
            System.out.println("File not found");
        }
        System.out.println("File size: " + myFile.length());
        if(myFile.canRead()){
            System.out.println("File can be read");
        }
        else{
            System.out.println("File can not be read");
        }
        if(myFile.canWrite()){
            System.out.println("File can be written");
        }
        else{
            System.out.println("File can not be written");
        }
    }
}