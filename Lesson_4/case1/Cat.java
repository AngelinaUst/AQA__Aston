package Lesson_4.case1;

class Cat extends Animal {
    private static final int maxRunDistance = 200;
    private static final int maxSwimDistance = 0;
    private static int catCount = 0;
    private boolean isHungry = true;

    public Cat(String name) {
        super(name);
        incrementCatCount();
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал/пробежала " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать больше " + maxRunDistance + " м.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }

    protected static void incrementCatCount() {
        catCount++;
        Animal.incrementAnimalCount();
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eatFromBowl(Bowl bowl, int amount) {
        if (bowl.decreaseFood(amount)) {
            isHungry = false;
            System.out.println(name + " съел/съела " + amount + " еды.");
        } else {
            System.out.println(name + " не смог/смогла поесть.");
        }
    }

    public boolean isHungry() {
        return isHungry;
    }
}