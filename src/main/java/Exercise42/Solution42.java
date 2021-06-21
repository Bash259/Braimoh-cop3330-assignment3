/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */


package Exercise42;

import java.io.*;
import java.util.*;

public class Solution42 {
    public static void main(String[] args) throws IOException {
        List<String> people = getStrings();
        System.out.println("\n");
        Formatter(people);
    }

    private static void Formatter(List<String> people) {
        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");
        int i;
        for (i = 0; i < people.size(); i++) {
            String[] split = people.get(i).split(",");
            if (split[0].contains("Ling")) {
                System.out.format(" %s  %8s  %10s\n", split[0], split[1], split[2]);
            }else if (split[0].contains("Johnson")){
                System.out.format(" %s  %5s  %10s\n", split[0], split[1], split[2]);
            }else if (split[0].contains("Zarnecki")) {
                System.out.format(" %s  %8s  %6s\n", split[0], split[1], split[2]);
            }else if (split[0].contains("Swift")) {
                System.out.format(" %s  %12s  %3s\n", split[0], split[1], split[2]);
            }else if (split[0].contains("Xiong")) {
                System.out.format(" %s  %8s  %9s\n", split[0], split[1], split[2]);
            } else {
                System.out.format(" %s %10s %9s\n", split[0], split[1], split[2]);
            }
            }
    }

    static List<String> getStrings() throws IOException{
        List<String> people = new ArrayList<>();
        //File reader
        try {
            File Input = new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise42\\exercise42_input.txt");

            BufferedReader br = new BufferedReader(new FileReader(Input));
            //loop to print out the names
            String Names;
            while ((Names = br.readLine()) != null) {
                people.add(Names);
                System.out.println(Names);
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
        return people;
    }
}
