package com.kleenxcoder.projectlombok.notnull;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonNonNullLombokTest {

	@Test
	public void test() {
		assertThrows(NullPointerException.class, () -> {
			PersonNonNullLombok person = new PersonNonNullLombok(null);
			log.debug(person.toString());
		});
	}
	
	@Test
	public void testEmpty() {
		PersonNonNullLombok person = new PersonNonNullLombok(""); //What about this?
		log.debug(person.toString());
	}
	
	@Test
	public void testBlank() {
		PersonNonNullLombok person = new PersonNonNullLombok(" "); //What about this?
		log.debug(person.toString());
	}
	
	@Test
	public void testChange() {
		PersonNonNullLombok person = new PersonNonNullLombok("Peter");
		person.setName(null); //What about this?
		log.debug(person.toString());
	}
}
