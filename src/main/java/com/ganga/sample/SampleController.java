package com.ganga.sample;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
}
