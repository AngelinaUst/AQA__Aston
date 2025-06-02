package Lesson_3.case2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Топ", LocalDate.of(2025,
                2, 1), "Carolina", "Korea", 55.99, true);
        productsArray[1] = new Product("Джинсы", LocalDate.of(2022,
                10, 25), "GJeans", "USA", 230.65, false);
        productsArray[2] = new Product("Джемпер", LocalDate.of(1952,
                12, 3), "Puma", "japan", 180.59, true);
        productsArray[3] = new Product("Куртка", LocalDate.of(2008,
                8, 8), "Reserved", "Russia", 1999, false);
        productsArray[4] = new Product("Кроссовки", LocalDate.of(2024,
                11, 14), "Puma", "japan", 580.69, false);
        productsArray[0].getInformation();
        productsArray[1].getInformation();
        productsArray[2].getInformation();
        productsArray[3].getInformation();
        productsArray[4].getInformation();
    }
}