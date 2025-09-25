package com.ganga.sample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class SampleController {
    private final SampleService sampleService;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return sampleService.getStudents();
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student) {
        
        sampleService.addStudent(student);
    }
}
