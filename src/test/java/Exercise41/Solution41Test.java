package Exercise41;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static Exercise41.Solution41.getStrings;
import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void main() throws IOException {
        ArrayList<String> test = new ArrayList<>();
        List<String> employees = getStrings();
        test.add("Ling, Mai");
        test.add("Johnson, Jim");
        test.add("Zarnecki, Sabrina");
        test.add("Jones, Chris");
        test.add("Jones, Aaron");
        test.add("Swift, Geoffrey");
        test.add("Xiong, Fong");

        assertEquals(test,employees);

    }
}