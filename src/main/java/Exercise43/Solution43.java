/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */


package Exercise43;


import java.io.File;
import java.util.Scanner;

public class Solution43 {
    private static final Scanner UserInput = new Scanner(System.in);
    public static void main(String[] args) {
        //print them
       //siteName("Site name:");
       //authorName("Author:");
       /*JavaScript("Do you want a folder for JavaScript?");
       CCS("Do you want a folder for CSS?");
        */
        String A = siteName("Site Name:");
       FileMaker(A,authorName("Author:"));
       javaClass J = new javaClass();
       J.javClassA(JavaScript("Do you want a folder for JavaScript?"),A);
       css C = new css();
       C.cssA(CCS("Do you want a folder for CSS?"),A);
    }
    private static String FileMaker(String SiteName,String AuthorName){
        new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise43\\website\\"+ SiteName).mkdirs();
        new File("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise43\\website\\"+SiteName+"\\index.html");
        String Output = "Created ./website/"+SiteName+"\n" +
                "Created ./website/"+ SiteName +"/index.html";
        System.out.println(Output);
        return Output;
    }

    private static String CCS(String prompt) {
        //request ccs
        System.out.println(prompt);
        String JavaScript = UserInput.next();
        if (JavaScript.equals("y")){
            return "y";
        }else {
            return "n";
        }
    }

    private static String JavaScript(String prompt) {
        //request java
        System.out.println(prompt);
        String JavaScript = UserInput.next();
        if (JavaScript.equals("y")){
            return "y";
        }else {
            return "n";
        }
    }

    private static String authorName(String prompt) {
        //request author name
        System.out.println(prompt);
        String authorName = UserInput.next();
        return authorName;
    }

    private static String siteName(String prompt) {
        //request site name
        System.out.println(prompt);
        String siteName = UserInput.next();
        return siteName;
    }
}
