package com.kleenxcoder.projectlombok.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonGetterSetterTest {
	
	private static final String PERSONS_FIRST_NAME_IS = "person name is: %s";
	
	@Test
	public void test() {
		PersonGetterSetter person = new PersonGetterSetter();
		person.setFirstName("Peter");
		
		log.debug(String.format(PERSONS_FIRST_NAME_IS, person.getFirstName()));
	}

}
