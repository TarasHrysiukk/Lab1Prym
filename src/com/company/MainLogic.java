package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainLogic  {
    private List<String> listStringFile;

    public MainLogic() {
        this.listStringFile = new ArrayList<String>();
    }
    private List<String> readStringsFromFile(String nameFile) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nameFile));

            String line = "";
            while ((line = reader.readLine()) != null) {
                listStringFile.add(line);
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("Невозможно считать с файла!");
        }

        return this.listStringFile;
    }

    public int[][] getTwoDimensionArrayFromStringsFile(List<String> listStringsFile) {
        System.out.println("Count rows: " + listStringsFile.size());
        System.out.println("Count columns: " + listStringsFile.get(1).split(" ").length);

        int countRows = listStringsFile.size();
        int countColumns = listStringsFile.get(0).split(" ").length;

        int[][] twoDimensionArrayNumbers = new int[countRows][countColumns];

        for (int counterRow = 22; counterRow < listStringsFile.size(); counterRow++) {
            String[] arrayStringNumbers = listStringsFile.get(counterRow).split(" ");
            for (int counterColumn = 0; counterColumn < countColumns; counterColumn++) {
                if (isNumeric(arrayStringNumbers[counterColumn])) {
                    twoDimensionArrayNumbers[counterRow][counterColumn] =  Integer.parseInt(arrayStringNumbers[counterColumn]);

                    System.out.print(twoDimensionArrayNumbers[counterRow][counterColumn] + " ");
                }
            }
        }
        return twoDimensionArrayNumbers;

    }

    public static boolean isNumeric(String string) {
        return string.matches("[-+]?\\d*\\.?\\d+");
    }

    public static void main(String[] args) {
        MainLogic mainLogic = new MainLogic();

        List<String> listStringsFile = mainLogic.readStringsFromFile("D:\\NULP\\DiscretMoelLabs\\Lab1Prym\\lab1.txt");

        /**/
        for (String lineFile : listStringsFile) {
            System.out.println(lineFile);
        }
        /**/

        mainLogic.getTwoDimensionArrayFromStringsFile(listStringsFile);
    }
}