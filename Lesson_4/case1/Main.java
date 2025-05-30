package Lesson_4.case1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Лонг");
        Dog dog2 = new Dog("Хеппи");
        Cat cat1 = new Cat("Стеша");
        Cat cat2 = new Cat("Буба");
        Cat cat3 = new Cat("Мотя");

        Bowl bowl = new Bowl(50);

        Cat[] cats = new Cat[5];
        cats[0] = (new Cat("Стеша"));
        cats[1] = (new Cat("Буба"));
        cats[2] = (new Cat("Мотя"));
        cats[3] = (new Cat("Кеша"));
        cats[4] = (new Cat("Черныш"));

        for (int i = 0; i < 5; i++) {
            cats[i].eatFromBowl(bowl, 15);
        }

        System.out.println("Состояние котов:");
        for (int i = 0; i < 5; i++) {
            if (cats[i].isHungry()) {
                System.out.println(cats[i].name + ": " + "голоден");
            } else {
                System.out.println(cats[i].name + ": " + "сыт");
            }
        }

        bowl.addFood(30);

        Cat.getCatCount();
        Animal.getAnimalCount();

        dog1.run(150);
        dog2.run(600);
        dog1.swim(5);
        dog2.swim(15);

        cat1.run(100);
        cat2.run(250);
        cat3.swim(10);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());
    }
}