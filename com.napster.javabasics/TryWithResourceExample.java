package com.napster.javabasics;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceExample {

    public static void main(String[] args) throws IOException {
        try(FileReader fileReader = new FileReader("example.txt")) {
             System.out.println("Reading File."+fileReader.read());
            }
        }
    }




