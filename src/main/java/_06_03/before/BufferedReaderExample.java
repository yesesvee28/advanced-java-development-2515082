package _06_03.before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) {
        //The difference between try and try with resources is that:
        // In try we read the file inside the try block but in try with resourses it read the file before the going inside
        // below is the example for try with resourses.
        try(BufferedReader reader=new BufferedReader(new FileReader("src/main/java/_06_03/example.txt"))){
            String firstLine=reader.readLine();
            System.out.println("First Line:");
            System.out.println(firstLine);

            StringBuilder stringBuilder=new StringBuilder();
            reader.lines().forEach(line->stringBuilder.append(line+"\n"));
            System.out.println("Rest of the lines:");
            System.out.println(stringBuilder);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}