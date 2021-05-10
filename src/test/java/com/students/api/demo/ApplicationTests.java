package com.students.api.demo;

import com.students.api.demo.entity.DisciplinaGeneral;
import com.students.api.demo.entity.InstantaDisciplina;
import com.students.api.demo.service.DataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private DataService dataService;
	@Test
	void contextLoads() {
	}

	@Test
	void test(){
		Optional<DisciplinaGeneral> test = dataService.test();
	}

	@Test
	void testIns(){
		Optional<InstantaDisciplina> test = dataService.testInst();
	}
}
