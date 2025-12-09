package _06_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {

    // This method should return the first line of BufferedReaderVsScanner.txt.
    String getFirstLine() {
        String firstLine = "";
        try(BufferedReader reader=new BufferedReader(new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))){
            firstLine=reader.readLine();
        }catch(IOException e){
            e.printStackTrace();
        }
        return firstLine;
    }

    // This method should return all of the content of BufferedReaderVsScanner.txt
    // as a single String.
    String getWholeFile() {
        String firstLine = "";
        String wholeFile = "";
        try(BufferedReader reader=new BufferedReader(new FileReader("src/main/java/_06_05/BufferedReaderVsScanner.txt"))){
            firstLine=reader.readLine();
            StringBuilder builder=new StringBuilder();
            reader.lines().forEach(line->builder.append(line+""));
            wholeFile=builder.toString();
        }catch(IOException e){
            e.printStackTrace();
        }       
        return wholeFile;
    }

}
