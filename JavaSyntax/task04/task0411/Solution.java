package com.codegym.task.task04.task0411;

/* 
Seasons on Terra

*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month == 12) {
            System.out.println("winter");
        }
        if (month < 12) {
            if (month > 8) {
                System.out.println("autumn");
            }
        }
        if (month < 9) {
            if (month > 5) {
                System.out.println("summer");
            }
        }
        if (month < 6) {
            if (month > 2) {
                System.out.println("spring");
            }
        }
        if (month < 3) {
            if (month > 0) {
                System.out.println("winter");
            }
        }
    }
}