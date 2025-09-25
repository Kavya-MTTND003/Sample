package com.ganga.sample;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SampleService {
    public List<Student> getStudents() {
        return List.of(
            new Student("Alice", 20),
            new Student("Bob", 22),
            new Student("Charlie", 23)
        );
    }
}
