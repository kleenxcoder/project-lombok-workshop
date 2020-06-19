package com.kleenxcoder.projectlombok.dto;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonDataTest {
	
	@Test
	public void testToString() {
		PersonData person = new PersonData();
		person.setFirstName("Peter");
		
		log.debug(person.toString());
	}
	
	@Test
	public void testGetterSetter() {
		PersonData person = new PersonData();
		person.setFirstName("Peter");
		
		log.debug(person.getFirstName());
	}
	
	@Test
	public void testEqualsAndHash() {
		PersonData person1 = createAndInitializePerson("Peter", "Stritzinger");
		PersonData person2 = createAndInitializePerson("Peter", "Stritzinger");
		
		log.debug("comparing ...");
		log.debug("person 1: " + person1.toString());
		log.debug("person 2: " + person2.toString());
		
		log.debug(".equals()   result: " + person1.equals(person2));
		log.debug(".hashCode() result: " + (person1.hashCode() == person2.hashCode()));
		
	}
	
	private PersonData createAndInitializePerson(String firstName, String lastName) {
		PersonData person = new PersonData();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		return person;
	}
	
	@Test
	public void test() {
		PersonData person1 = new PersonData("Peter", "Stritzinger", null, "kleenxcoder", null, null);
		PersonData person2 = new PersonData("Peter", "Stritzinger", null, "kleenxcoder", null, null);
		
		log.debug("comparing ...");
		log.debug("person 1: " + person1.toString());
		log.debug("person 2: " + person2.toString());
		
		log.debug(".equals()   result: " + person1.equals(person2));
		log.debug(".hashCode() result: " + (person1.hashCode() == person2.hashCode()));
		
	}

}
