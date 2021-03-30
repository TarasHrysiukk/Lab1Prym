package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWorker {

    File lab1File = new File("lab1.txt");
    public void FileWorkerMethod() throws IOException {
      ///  List<String> listNumb = new ArrayList<>();
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(lab1File);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            String str[] = line.split(" ");
            // считываем остальные строки в цикле
            System.out.println(Arrays.toString(str) + " array");
            line = reader.readLine();
        }
    }
}
