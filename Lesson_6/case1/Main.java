package Lesson_6.case1;

import java.util.*;


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
        printStudents(students,2);
    }

    public static void deleteStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageMark() < 3.0);
    }

    public static void transferStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageMark() >= 3.0) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    public static void printStudents(Set<Student> students, int course){
        for (Student student: students){
            if (student.course == course){
                System.out.println(student.name);
            }
        }
    }
}