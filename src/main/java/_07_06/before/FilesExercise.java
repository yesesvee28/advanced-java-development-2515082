package _07_06.before;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
public class FilesExercise {

    public static void main(String[] args) {
        try{
             // Create a new empty file called example.txt inside folderA
                Path path=Paths.get("/Users/yesesvee/Desktop/advanced-java-development-2515082/src/main/java/_07_06/folderA/example.txt");
                if(Files.notExists(path)){
                    Files.createFile(path);
                }

             // Copy the file to folderB
                Path pathToNewLocation=Paths.get("/Users/yesesvee/Desktop/advanced-java-development-2515082/src/main/java/_07_06/folderB/example.txt");
                if(Files.notExists(pathToNewLocation)){
                    Files.copy(path,pathToNewLocation);
                }
              // List the contents of folderB to check that your file is in there
                Files.list(Paths.get("/Users/yesesvee/Desktop/advanced-java-development-2515082/src/main/java/_07_06/folderB"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
