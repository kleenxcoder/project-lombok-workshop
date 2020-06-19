package com.kleenxcoder.projectlombok.log;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonLog {

	public PersonLog() {
		log.debug("inside constructor");
	}

}
