package Exercise44;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class productGetterTest {

    @Test
    public void productGetterA_Test_correct_value() {
        productGetter product = new productGetter();
        JsonWriter fileWriter = new JsonWriter();

        String input = "Thing";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("Name: Thing\n Price: 15\n Quantity: 5\n", product.productGetterA(fileWriter.Writer()));
    }

    @Test
    public void productGetterA_Test_wrong_value() {
        productGetter product = new productGetter();
        JsonWriter fileWriter = new JsonWriter();

        String input = "Tuff";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("Sorry, that product was not found in our inventory.", product.productGetterA(fileWriter.Writer()));
    }
}