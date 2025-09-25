package com.ganga.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private List<Student> students = new ArrayList<>(
        List.of(
        new Student(1, "Alice", 20),
        new Student(2, "Bob", 22),
        new Student(3, "Charlie", 23))
    );

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        student.setId(students.size() + 1);
        students.add(student);
    }
}
