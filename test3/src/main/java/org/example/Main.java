package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String sourcePath = "H:\\jalin\\testJln\\test3\\input.txt";
        try {
            FileInputStream fstream = new FileInputStream(sourcePath);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            String[] nyoba = br.readLine().split(";");
            System.out.println(nyoba);
            BufferedReader brTest = new BufferedReader(new FileReader(sourcePath));
            String text = brTest.readLine();
            String[] title = text.split(";");
            System.out.println("Selamat siang rekan bank " + title[0]+ ",");
            System.out.println("Mohon bantuan untuk sign on pada envi berikut: ");


            while ((strLine = br.readLine()) != null) {
                String[] line = strLine.split(";");
                System.out.println("- Envi "+ line[1]+" "+ "Port "+ line[2] +" terpantau " + line[4]);

            }
            System.out.println("terima kasih");
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}