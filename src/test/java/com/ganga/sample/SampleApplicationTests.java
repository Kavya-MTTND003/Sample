package com.ganga.sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.RequiredArgsConstructor;

@SpringBootTest
@RequiredArgsConstructor
class SampleApplicationTests {
	private final SampleService sampleService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetStudents() {
		List<Student> students = sampleService.getStudents();

		 assertEquals(3, students.size(), "There should be 3 students");

        // Check names
        assertEquals("Alice", students.get(0).getName());
        assertEquals("Bob", students.get(1).getName());
        assertEquals("Charlie", students.get(2).getName());

        // Check ages
        assertEquals(20, students.get(0).getAge());
        assertEquals(22, students.get(1).getAge());
        assertEquals(23, students.get(2).getAge());
	}

}
