package com.ganga.sample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    private List<Student> students = new ArrayList<>(
        List.of(
        new Student("Alice", 20),
        new Student("Bob", 22),
        new Student("Charlie", 23))
    );

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
