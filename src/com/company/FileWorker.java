package com.company;

import java.io.*;

public class FileWorker {

    File lab1File = new File("D:\\NULP\\DiscretMoelLabs\\Lab1Prym\\lab1.txt");
    public void FileWorkerMethod() throws IOException {
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(lab1File);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            // считываем остальные строки в цикле
            line = reader.readLine();
        }

    }
}
