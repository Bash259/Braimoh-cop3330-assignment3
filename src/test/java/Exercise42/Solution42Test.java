package Exercise42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Solution42Test {

    @Test
    void main() {

    }

    @Test
    List<String> getStrings() throws IOException {
        List<String> people = getStrings();
        ArrayList<String> FileInput = new ArrayList<>();
        FileInput.add("Ling,Mai,55900");
        FileInput.add("Johnson,Jim,56500");
        FileInput.add("Jones,Aaron,46000");
        FileInput.add("Jones,Chris,34500");
        FileInput.add("Swift,Geoffrey,14200");
        FileInput.add("Xiong,Fong,65000");
        FileInput.add("Zarnecki,Sabrina,51500");

        Assertions.assertEquals(people, FileInput);
        return people;
    }
}