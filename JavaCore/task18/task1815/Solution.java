package com.codegym.task.task18.task1815;

import java.util.List;

/* 
Table

*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        TableInterface tableInterface;

        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tableInterface = tableInterface;

        }

        @Override
        public void setModel(List rows) {
            tableInterface.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return tableInterface.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tableInterface.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}