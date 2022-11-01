package com.antipov;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        {
            double a = 4;
            double b = 6;
            double c = 8;

            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println("Площа трикутрика: " + area);
            }
        }
        {
            Random random = new Random(10);
            int a = random.nextInt(668);
            int b = random.nextInt(668);
            int c = random.nextInt(668);
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            int ab = Math.min(a, b);
            int ac = Math.min(a, c);
            int min = Math.min(ab, c);
            int minByModule = a < b ? ac : min;
            System.out.println("Найменше " + minByModule);
        }
        {
            int a = (int) (Math.random() * 200 - 100);
            System.out.println(a);
            String b = a % 2 == 0 ? "Число парне" : "Число не парне";
            System.out.println(b);
        }
    }
}

