package com.javacode.samples.iostreams;

import lombok.Data;

import java.util.Scanner;

@Data
public class ScannerExample {
    public void examples(){
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        String s = scanner.next();

        Long ph = scanner.nextLong();

    }
}
