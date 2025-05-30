package Lesson_4.case1;

public class Animal {
    private static int animalCount = 0;

    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    protected static void incrementAnimalCount() {
        animalCount++;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}