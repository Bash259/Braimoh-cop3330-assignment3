/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise43;

import java.io.File;

public class css {
    public String cssA(String Answer,String Name) {
        String OutputA;
        if (Answer.equals("y")) {
            new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise43\\website\\"+Name+"\\css").mkdirs();
            OutputA = "Created ./website/"+Name+"/css/";
            System.out.println(OutputA);
            return OutputA;
        }else {
            return null;
        }
    }
}
