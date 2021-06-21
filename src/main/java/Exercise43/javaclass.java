/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise43;


import java.io.File;

class javaClass {
    public String javClassA(String Answer,String Name) {
        String OutputA;
        if (Answer.equals("y")) {
            new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise43\\website\\"+ Name +"\\js").mkdirs();
            OutputA = "Created ./website/"+Name+"/js/";
            System.out.println(OutputA);
            return OutputA;
        }else {
            return null;
        }
    }

}
