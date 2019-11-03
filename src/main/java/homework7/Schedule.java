package homework7;

import java.util.Arrays;

public class Schedule {
    private String[][] table = new String[7][2];

    public Schedule(String[][] table) {
        this.table = table;
    }

    public String[][] getTable() {
        return table;
    }

    public void setTable(String[][] table) {
        this.table = table;
    }


    @Override
    public String toString() {
        return "Schedule{" +
                "table=" + Arrays.toString(table) +
                '}';
    }
}
