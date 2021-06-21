/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise45;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOutput {
    private static final Scanner UserInput = new Scanner(System.in);
    public void FileOutput(ArrayList<String> Output){
        System.out.println("Enter the name of the output file:");
        String Input = UserInput.nextLine();
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise45\\"+Input);
                myWriter.write(String.valueOf(Output));
                myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }
}
