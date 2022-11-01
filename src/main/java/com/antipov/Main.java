package com.antipov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Antipov Volodymyr");

        int y = 5;
        for (
                int i = 0;
                i < 11; i = i + 1, y = y + 2) {
            System.out.print("Крок: " + i + " Значення: ");
            System.out.println(y);
        }
        for (int i = 0; i < 11; i = i + 1) {
            if (i == 3)
                continue;
            if (i == 6)
                break;
            System.out.println(i + " Крок");
        }
    }
}
