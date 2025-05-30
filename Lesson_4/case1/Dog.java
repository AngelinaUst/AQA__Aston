package Lesson_4.case1;

class Dog extends Animal {
    private static final int maxRunDistance = 500;
    private static final int maxSwimDistance = 10;
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        incrementDogCount();
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал/пробежала " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }

    protected static void incrementDogCount() {
        dogCount++;
        Animal.incrementAnimalCount();
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл/проплыла " + distance + " м.");
        } else {
            System.out.println(name + " не может проплыть больше " + maxSwimDistance + " м.");
        }
    }
}