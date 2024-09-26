package org.acme;

import java.util.ArrayList;
import java.util.List;

public class StudentProcessor {
    public class Student {
        public String name;
        public int score;

        public Student(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    public List<Student> findTopStudents(List<Student> students) {
        List<Student> topStudents = new ArrayList<>();
        for (Student student : students) {
            if (topStudents.size() < 3) {
                topStudents.add(student);
            } else {
                for (int i = 0; i < topStudents.size(); i++) {
                    if (student.score > topStudents.get(i).score) {
                        topStudents.set(i, student);
                        break;
                    }
                }
            }
        }
        return topStudents;
    }

    public void printTopStudents(List<Student> topStudents) {
        for (Student student : topStudents) {
            System.out.println("Student: " + student.name + ", Score: " + student.score);
        }
    }
}

