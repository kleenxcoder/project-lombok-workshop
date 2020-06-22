package com.kleenxcoder.projectlombok.notnull;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonNonNullJavaTest {

	@Test
	public void test() {

		assertThrows(InvalidPerson.class, () -> {
			PersonNonNullJava person = new PersonNonNullJava(null);
			FeasibilityCheck feasibilityCheck = new FeasibilityCheck(person);
			log.debug(person.toString());
			log.debug("isPersonValid? " + feasibilityCheck.isValid());

		});

	}

	public class FeasibilityCheck {

		private PersonNonNullJava person;

		public FeasibilityCheck(PersonNonNullJava person) {
		}

		public boolean isValid() {
			if ( !(isPersonValid() && isFirstNameNotNull() && isFirstNameNotEmpty()) ) {
				throw new InvalidPerson("person is not valid");
			}
			return true;
		}

		private boolean isPersonValid() {
			return this.person != null;
		}

		private boolean isFirstNameNotEmpty() {
			return this.person.getName() != null;
		}

		private boolean isFirstNameNotNull() {
			return this.person.getName().trim().length() > 0;
		}

	}

	public class InvalidPerson extends RuntimeException {

		private static final long serialVersionUID = 1L;
		
		public InvalidPerson(String errorMessage) {
			super(errorMessage);
		}

	}

}
