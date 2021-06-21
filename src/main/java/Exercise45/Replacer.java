/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise45;

import java.util.ArrayList;

public class Replacer {
    public ArrayList<String> wordSwitcher(ArrayList<String> OldInput) {
        //change the input
        ArrayList<String> newSentence = new ArrayList<>();
        int i;
        for (i = 0;i < OldInput.size();i++) {
            OldInput.get(i);
            if (OldInput.get(i).contains("utilize")){
                newSentence.add(OldInput.get(i).replace("utilize","use"));
                System.out.println(newSentence.get(i));
            }else{
                newSentence.add(OldInput.get(i));
                System.out.println(newSentence.get(i));
            }
        }
        return newSentence;
    }
}
