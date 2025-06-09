package Lesson_6.case1;

import java.util.Map;
import java.util.Set;

public class Student {
    public String name;
    public String group;
    public int course;
    public Map<String, Integer> marks;

    public Student(String name, String group, int course, Map<String, Integer> marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public Map<String, Integer> getMarks() {
        return marks;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageMark() {
        int sum = 0;
        for (int mark : marks.values()) {
            sum += mark;
        }
        return (double) sum / marks.size();
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

    public static void printStudents(Set<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}