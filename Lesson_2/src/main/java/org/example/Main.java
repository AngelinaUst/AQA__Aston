package src.main.java.org.example;

public class Main {
    public static void main(String[] args) {
        int a = 7;
        int b = 5;
        int year = 1995;
        System.out.println("Задача 1:");
        printThreeWords();
        System.out.println("Задача 2:");
        checkSumSign();
        System.out.println("Задача 3:");
        printColor();
        System.out.println("Задача 4:");
        compareNumbers();
        System.out.println("Задача 5:");
        System.out.println(checkNumbers(a, b));
        System.out.println("Задача 6:");
        number(a);
        System.out.println("Задача 7:");
        System.out.println(numberLogic(a));
        System.out.println("Задача 8:");
        lineNumber("Строчка и точка.", 5);
        System.out.println("Задача 9:");
        System.out.println(leapYear(year));
        System.out.println("Задача 10:");
        createArray();
        System.out.println("Задача 11:");
        newArrayHundred();
        System.out.println("Задача 12:");
        arrayMultiply();
        System.out.println("Задача 13:");
        tableArray();
        System.out.println("Задача 14:");
        int[] arr = generateArray(5,5);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 3;
        int b = -8;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 3;
        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (0 < value && value < 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }

    public static void compareNumbers() {
        int a = 35;
        int b = 48;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean checkNumbers(int a, int b) {
        int sum = a + b;
        if (10 <= sum && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void number(int a) {
        if (a >= 0) {
            System.out.println("Полжительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean numberLogic(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void lineNumber(String line, int time) {
        for (int i = 0; i < time; i++) {
            System.out.println(line);
        }
    }

    public static boolean leapYear(int year) {
        if (year % 4 == 0 && (year % 100 != 0 || (year % 100 == 0 && year % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }

    public static void createArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void newArrayHundred() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void arrayMultiply() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void tableArray() {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - i - 1] = 1;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[] generateArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}