package dev.erica.loops;

import java.util.List;

import dev.erica.loops.multiplicate_table.MultiplicateTable;

public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        MultiplicateTable table = new MultiplicateTable(5);
        List<String> result = table.genTable();
        for (String line : result) {  
            System.out.println(line);
        }    
    }
}
