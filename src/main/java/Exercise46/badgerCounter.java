/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise46;

import java.util.ArrayList;
import java.util.List;

//make a class that finds the words
public class badgerCounter {
    static int countOccurrences(List<String> input)
    {
        String splitter[] = input.toString().split(" ");

        String word = "badger";

        int count = 0;
        for (String s : splitter) {
            // if match found increase count
            if (word.equals(s))
                count++;
        }
        return count;
    }
}
