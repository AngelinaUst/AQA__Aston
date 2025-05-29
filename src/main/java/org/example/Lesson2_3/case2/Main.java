package org.example.Lesson2_3.case2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        org.example.Lesson2_3.case2.Product[] productsArray = new org.example.Lesson2_3.case2.Product[5];
        productsArray[0] = new org.example.Lesson2_3.case2.Product("Топ", LocalDate.of(2025,
                2, 1), "Carolina", "Korea", 55.99, true);
        productsArray[1] = new org.example.Lesson2_3.case2.Product("Джинсы", LocalDate.of(2022,
                10, 25), "GJeans", "USA", 230.65, false);
        productsArray[2] = new org.example.Lesson2_3.case2.Product("Джемпер", LocalDate.of(1952,
                12, 3), "Puma", "japan", 180.59, true);
        productsArray[3] = new org.example.Lesson2_3.case2.Product("Куртка", LocalDate.of(2008,
                8, 8), "Reserved", "Russia", 1999, false);
        productsArray[4] = new org.example.Lesson2_3.case2.Product("Кроссовки", LocalDate.of(2024,
                11, 14), "Puma", "japan", 580.69, false);
        productsArray[0].getInformation();
        productsArray[1].getInformation();
        productsArray[2].getInformation();
        productsArray[3].getInformation();
        productsArray[4].getInformation();
    }
}