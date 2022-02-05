package com.javacode.samples.iostreams;

import lombok.NoArgsConstructor;

import java.io.*;

@NoArgsConstructor
public class BufferedReaderExample {
    File file = new File("example.txt");

    public void examples(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
