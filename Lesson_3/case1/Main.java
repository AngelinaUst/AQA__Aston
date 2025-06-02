package Lesson_3.case1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("Топ", LocalDate.of(2025, 2, 1),
                "Carolina", "Korea", 55.99, true);
        product.getInformation();
    }
}