package org.example.Lesson2_3.case1;

import java.time.LocalDate;

public class Product {
    private String name;
    private LocalDate productionDate;
    private String manufacturer;
    private String countryOfOrigen;
    private double price;
    private boolean isReserve;

    public Product(String name, LocalDate productionDate, String manufacturer, String countryOfOrigen,
                   double price, boolean isReserve) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigen = countryOfOrigen;
        this.price = price;
        this.isReserve = isReserve;
    }
    public void getInformation(){
        System.out.print(this.name + " ");
        System.out.print(this.productionDate + " ");
        System.out.print(this.manufacturer + " ");
        System.out.print(this.countryOfOrigen + " ");
        System.out.print(this.price + " ");
        System.out.println(this.isReserve);
    }
}