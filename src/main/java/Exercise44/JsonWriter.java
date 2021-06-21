/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Fouad Braimoh
 */

package Exercise44;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {
    public JSONObject Writer(){
        //First Item
        JSONObject Item1 = new JSONObject();
        Item1.put("name", "Widget");
        Item1.put("price", 25.00);
        Item1.put("quantity", 5);

        //Second Item
        JSONObject Item2 = new JSONObject();
        Item2.put("name", "Thing");
        Item2.put("price", 15);
        Item2.put("quantity", 5);

        JSONObject Item3 = new JSONObject();
        Item3.put("name", "Doodad");
        Item3.put("price", 5);
        Item3.put("quantity", 10);


        //Add products to list
        JSONArray productList = new JSONArray();
        productList.add(Item1);
        productList.add(Item2);
        productList.add(Item3);

        JSONObject products = new JSONObject();
        products.put("products",productList);

        //Write JSON file
        try (FileWriter file = new FileWriter("C:\\Users\\braim\\Documents\\Excercises\\Assignment3\\src\\main\\java\\Exercise44\\exercise44_input.json")) {
            file.write(products.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }

    }
