package com.kleenxcoder.projectlombok.log;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class PersonLogTest {
	
	@Test
	public void test() {
		log.debug("creating person");
		PersonLog person = new PersonLog();
		log.debug("created person -> " + person.toString());
	}

}
