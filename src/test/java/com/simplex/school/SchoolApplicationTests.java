package com.simplex.school;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoolApplicationTests {

	@Test
	void contextLoads() {
		final var test = "test";
		Assertions.assertNotNull(test);
	}

}
