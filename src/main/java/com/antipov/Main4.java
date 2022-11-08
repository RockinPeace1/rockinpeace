package com.antipov;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("First task");
        String line = "Hello world!";

        char firstSymbol = line.charAt(line.indexOf("H"));
        int a = line.length();
        char lastSymbol = line.charAt(a - 1);
        System.out.println("The first symbol is: " + firstSymbol);
        System.out.println("The last symbol is: " + lastSymbol);

        System.out.println();

// task 2

        System.out.println("Task 2.1");

        String substring = "se";

        String string = "Java Exercises";
        System.out.println("Does the string " + string + " ends with " + substring + "?");
        System.out.println(string.endsWith(substring));

        String string2 = "Java Exercise";
        System.out.println("Does the string " + string2 + " ends with " + substring + "?");
        System.out.println(string2.endsWith(substring));

        System.out.println();
//tusk 3
        String name = "Stephen Edwin King";
        System.out.println("Name" + name);
        System.out.println("String does not contain Stephen Edwin King " + name.contains("Walter Winchell"));
        System.out.println("String contains Stephen Edwin King " + name.contains("Edwin"));

        System.out.println();
//task 3.1
        String firstData = "Walter Winchell";
        String secondData = "stephen edwin king";
        String firstComparison = String.valueOf(firstData.equalsIgnoreCase(name));
        System.out.println(firstComparison);
        String secondComparison = String.valueOf(secondData.equalsIgnoreCase(name));
        System.out.println(secondComparison);

        System.out.println();
// task 4
        String firstString = "Red is favorite color.";
        String secondString = "Orange is also my favorite color.";
        System.out.println(firstString.startsWith("Red"));
        System.out.println(secondString.startsWith("Red"));
    }
}

