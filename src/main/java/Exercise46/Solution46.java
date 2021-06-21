/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise46;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


//Make a class that takes input
class FileInput {
        public static List<String> getStrings() throws IOException {
            //file Input collector
            List<String> Words = new ArrayList<>();
            try {
                File Input = new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise46\\exercise46_input.txt");

                BufferedReader br = new BufferedReader(new FileReader(Input));
                //loop to print out the names
                String Names;
                while ((Names = br.readLine()) != null) {
                    Words.add(Names);
                    System.out.println(Names);
                }
            }
            catch (IOException e) {
                System.out.println("An error occurred.");
            }
            return Words;
        }
    }
// make a class that prints the **
    class StarPrinter{
    public void StarPrinterA(int counter,String prompt){
        List<String> stars = new ArrayList<>();
        int i;
        for (i=0;i < counter;i++){
           stars.add("*");
        }
        System.out.println(prompt + stars.toString().replace("["," ").replace("]"," ").replace(","," "));
    }
    }


public class Solution46 {
    public static void main(String[] args) throws IOException {
        List<String> Input = FileInput.getStrings();
        StarPrinter starPrinter = new StarPrinter();
        starPrinter.StarPrinterA(badgerCounter.countOccurrences(Input),"badger: ");
        starPrinter.StarPrinterA(mushroomCounter.countOccurrences(Input),"mushroom: ");
        starPrinter.StarPrinterA(snakeCounter.countOccurrences(Input),"snake: ");


    }
}
