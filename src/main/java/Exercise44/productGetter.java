/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise44;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.Scanner;

public class productGetter {
    private static final Scanner UserInput = new Scanner(System.in);
    public String productGetterA(JSONObject product) {
        {
            //Item checker
            JSONArray productObject = (JSONArray) product.get("products");
            JSONObject pro1 = (JSONObject) productObject.get(0);
            JSONObject pro2 = (JSONObject) productObject.get(1);
            JSONObject pro3 = (JSONObject) productObject.get(2);
            while (true) {
                System.out.println("What is the product name?");
                String Input = UserInput.nextLine();
                if (pro1.get("name").equals(Input)) {
                    String Output = "Name: " + pro1.get("name")+"\nPrice: "+pro1.get("price")+"\nQuantity: "+pro1.get("quantity");
                    System.out.println(Output);
                    return Output;
                }else if (pro2.get("name").equals(Input)) {
                    String Output = "Name: " + pro2.get("name")+"\nPrice: "+pro2.get("price")+"\nQuantity: "+pro2.get("quantity");
                    System.out.println(Output);
                    return Output;
                }else if (pro3.get("name").equals(Input)) {
                    String Output = "Name: " + pro3.get("name")+"\nPrice: "+pro3.get("price")+"\nQuantity: "+pro3.get("quantity");
                    System.out.println(Output);
                    return Output;
                }else {
                    String Output = "Sorry, that product was not found in our inventory.";
                }
            }

        }
    }
}
