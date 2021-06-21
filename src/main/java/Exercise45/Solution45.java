/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise45;

import Exercise45.Replacer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution45 {
    public static void main(String[] args) throws IOException {
        //output to file
        Replacer wordChanger = new Replacer();
        FileOutput out = new FileOutput();
        out.FileOutput(wordChanger.wordSwitcher(getStrings()));
    }


    static ArrayList<String> getStrings() throws IOException {
        //Copy sentence from input file
        String Names = null;
        ArrayList<String> Sentence = new ArrayList<>();
        try {
            File Input = new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise45\\exercise45_input.txt");

            BufferedReader br = new BufferedReader(new FileReader(Input));

            while ((Names = br.readLine()) != null) {
                Sentence.add(Names);
                System.out.println(Names);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
        return Sentence;
    }
}
