package Lesson_6.case1;

import java.util.*;

import static Lesson_6.case1.Student.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Екатерина Кузнецова", "Группа 12а", 1,
                Map.of("Логика", 4, "Философия искусств", 5, "История", 3)));
        students.add(new Student("Максим Антонов", "Группа 14б", 1,
                Map.of("Социология", 2, "Философия искусств", 3, "Логика", 2)));
        students.add(new Student("Григорий Лепс", "Группа 11с", 3,
                Map.of("Философия искусств", 2, "Социология", 2, "Этика", 2)));
        deleteStudents(students);
        transferStudents(students);
        printStudents(students, 2);
    }
}