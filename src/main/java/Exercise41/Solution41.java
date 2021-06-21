/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise41;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution41 {
    public static void main(String[] args) throws IOException {
        List<String> employees = getStrings();
        printer(employees);
        FileWriter(employees);
    }

    private static void FileWriter(List<String> employees) {
        int i;
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise41\\exercise41_output.txt");
            myWriter.write("Total of 7 names\n");
            myWriter.write("----------------\n");
            for(i =0; i < employees.size(); i++) {
                myWriter.write(employees.get(i)+"\n");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    private static List<String> printer(List<String> employees) {
        //sorting the file
        Collections.sort(employees);

        //printing the sorted file
        System.out.println("\n");
        System.out.println("Total of 7 names");
        System.out.println("----------------");
        int i;
        for( i =0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
        return employees;
    }

    @NotNull
    static List<String> getStrings() throws IOException {
        //file printer
        List<String> employees = new ArrayList<>();
        try {
            File Input = new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise41\\exercise41_input.txt");

            BufferedReader br = new BufferedReader(new FileReader(Input));
            //loop to print out the names
            String Names;
            while ((Names = br.readLine()) != null) {
                employees.add(Names);
                System.out.println(Names);
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
        return employees;
    }
}
