package org.example;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String sourcePath = "H:\\jalin\\testJln\\test3\\input.txt";
        try {
            FileInputStream fstream = new FileInputStream(sourcePath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;

            List<String> allData = new ArrayList<String>();
            List<String> header = new ArrayList<String>();
            while ((strLine = br.readLine()) != null) {
                String[] line = strLine.split(";");
                header.add(line[0]);
                allData.add(strLine);
            }

            List<String> newList = new ArrayList<>();
            Set<String> uniqueValues = new HashSet<>();
            for (String s : header) {
                if (uniqueValues.add(s)) {
                    newList.add(String.valueOf(s));
                }
            }

            for (int i = 0; i < newList.toArray().length; i++) {
                System.out.println("Selamat siang rekan bank " + newList.get(i) + ",");
                System.out.println("Mohon bantuan untuk sign on pada envi berikut: ");
                System.out.println("");
                for(int k = 0; k < 3; k ++){
                    if(Objects.equals(allData.get(k).split(";")[0], newList.get(i))) {
                        String[] line = allData.get(k).split(";");
                        System.out.println("- Envi "+ line[1]+" "+ "Port "+ line[2] +" terpantau " + line[4]);

                    }

                }
                System.out.println("");
                System.out.println("terima kasih");
                System.out.println("\n");
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}