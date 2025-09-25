package com.ganga.sample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {
    
    @GetMapping("/students")
    public List<Student> getStudents() {
        return List.of(
            new Student("Alice", 20),
            new Student("Bob", 22),
            new Student("Charlie", 23)
        );
    }
}
