package dev.erica.loops.multiplicate_table;

import java.util.ArrayList;
import java.util.List;

public class MultiplicateTable {
    public int num;

    public MultiplicateTable(int num) {
        this.num = num;
    }

    public List<String> genTable() {
        List<String> table = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            table.add(num + " x " + i + " = " + (num * i));
        }
        return table;
    }



}
