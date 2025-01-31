package dev.erica.loops.multiplicate_table;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Erica
 */
public class MultiplicateTableTest {

    @Test
    @DisplayName("Test para generar la tabla de multiplicar")
    public void testGenTable() {
       MultiplicateTable table = new MultiplicateTable(5);
       List<String> result = table.genTable();

       List<String> expected = Arrays.asList(
        "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
       );

       assertThat(result, is(expected));
    }

}