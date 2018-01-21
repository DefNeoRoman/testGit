package com;

import java.io.*;
import java.util.stream.Stream;

public class Testing {
    public void parseCtbFile() {
       File file = new File("D:\\mySandbox\\testGit\\testGit\\src\\resources\\test.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Stream<String> lines = new BufferedReader(new InputStreamReader(fileInputStream)).lines();
            lines.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {


        Testing testing = new Testing();
        testing.parseCtbFile();
    }
}
