package hw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Logger;

public class ProcessingAppDemo {
    public static void main(String[] args){
        FileReader file;
        Logger logger = Logger.getLogger(ProcessingAppDemo.class.getName());
        try {
            file = new FileReader("file/input_files");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(file);


    }

}
