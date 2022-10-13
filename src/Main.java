public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задание 1.1
        System.out.println("Задание 1.1 ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задание 1.2
        System.out.println(" Задание 1.2 ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        // Задание 1.3
        System.out.println("Задание 1.3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }
        // Задание 1.4
        System.out.println("Задание 1.4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        // Задание 2.1
        System.out.println("Задание 2.1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным ");
        }
        // Задание 2.2
        System.out.println("Задание 2.2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        // Задание 2.3
        System.out.println("Задание 2.3");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }
        // Задание 3.1
        System.out.println("Задание 3.1");
        int income = 29000;
        int month = 0;
        for (int i = 1; i <= 12; i++) {
            month = month + income;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + month + " рублей");
        }
        // Задание 3.2
        System.out.println("Задание 3.2");
        int income2 = 29000;
        int month2 = 0;
        for (int i = 1; i <= 12; i++) {
            month2 = month2 + month2 / 100;
            month2 = month2 + income;
            System.out.println(" Месяц " + i + ", сумма накоплений равна " + month2 + " рублей");
        }

    }
    }

