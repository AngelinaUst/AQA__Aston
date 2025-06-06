package Lesson_6.case2;

public class Main {
    public static void main(String[] args) {
        TelephoneDirectory directory = new TelephoneDirectory();
        directory.add("Ивановский", "375-55-5555555");
        directory.add("Шпак", "8029-9999999");
        directory.add("Ивановский", "4022-2222222");
        directory.add("Чернышенко", "77-88");
        System.out.println("Ивановский" + " " + directory.get("Ивановский"));
        System.out.println("Шпак" + " " + directory.get("Шпак"));
        System.out.println("Чернышенко" + " " + directory.get("Чернышенко"));
        System.out.println("Гаврилов" + " " + directory.get("Гаврилов"));
    }
}