package com.kleenxcoder.projectlombok.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonToStringTest {
	
	@Test
	public void test() {
		PersonToString person = new PersonToString();
		person.setFirstName("Peter");
		
		log.debug(person.toString());
	}

}
