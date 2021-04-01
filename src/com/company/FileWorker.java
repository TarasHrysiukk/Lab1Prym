package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileWorker {

    File lab1File = new File("lab1.txt");
    int[][] arr;
    boolean t = false;
    public void FileWorkerMethod() throws IOException {
        //создаем объект FileReader для объекта File
        FileReader fr = new FileReader(lab1File);
        //создаем BufferedReader с существующего FileReader для построчного считывания
        BufferedReader reader = new BufferedReader(fr);
        // считаем сначала первую строку
        String line = reader.readLine();
        String strFirst[]= line.split(" ");
        while (line != null) {
            System.out.println(line);
            //дфлимо на масив розділючи числа пробілом " "
            String str[]= line.split(" ");

            // считываем остальные строки в цикле
            System.out.println("length " + str.length  + " : "+ Arrays.toString(str) );;
            //System.out.println(Arrays.toString(str) + " array");
            line = reader.readLine();

        }
        System.out.println();


    }
}
