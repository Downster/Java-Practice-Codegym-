package com.codegym.task.task15.task1518;

/* 
Static modifiers and kittens

*/

public class Solution {
    public static Cat cat;

    public static class Cat{
        public String name;
    }
    static {
        Cat cat = new Cat();
        cat.name = "Tommy";
        Solution.cat = cat;
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }
}
