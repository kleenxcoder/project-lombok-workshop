package com.kleenxcoder.projectlombok.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonAllArgsConstructorTest {
	
	@Test
	public void test() {
		PersonAllArgsConstructor person1 = new PersonAllArgsConstructor("Peter", "Stritzinger", null, "kleenxcoder", null, null);
		PersonAllArgsConstructor person2 = new PersonAllArgsConstructor("Peter", "Stritzinger", null, "kleenxcoder", null, null);
		
		log.debug("comparing ...");
		log.debug("person 1: " + person1.toString());
		log.debug("person 2: " + person2.toString());
		
		log.debug(".equals()   result: " + person1.equals(person2));
		log.debug(".hashCode() result: " + (person1.hashCode() == person2.hashCode()));
		
	}

}
