package com.kleenxcoder.projectlombok.equalsandhashcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.kleenxcoder.projectlombok.equalsandhashcode.PersonEqualsAndHashCode;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonEqualsAndHashCodeTest {
	
	@Test
	public void test() {
		PersonEqualsAndHashCode person1 = createAndInitializePerson("Peter", "Stritzinger");
		PersonEqualsAndHashCode person2 = createAndInitializePerson("Peter", "Stritzinger");
		
		log.debug("comparing ...");
		log.debug("person 1: " + person1.toString());
		log.debug("person 2: " + person2.toString());
		
		log.debug(".equals()   result: " + person1.equals(person2));
		log.debug(".hashCode() result: " + (person1.hashCode() == person2.hashCode()));
		
	}
	
	private PersonEqualsAndHashCode createAndInitializePerson(String firstName, String lastName) {
		PersonEqualsAndHashCode person = new PersonEqualsAndHashCode();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		return person;
	}

}
