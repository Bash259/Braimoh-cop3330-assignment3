/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise44;

import org.json.simple.JSONObject;

public class Solution44 {
    public static void main(String[] args) {
        //File Input
        JsonWriter fileWriter = new JsonWriter();
        fileWriter.Writer();
        //Json storage
        //UserInput
        productGetter productGetter = new productGetter();
        productGetter.productGetterA(fileWriter.Writer());
        //Output
    }
}
