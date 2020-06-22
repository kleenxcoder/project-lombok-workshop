package com.kleenxcoder.projectlombok.notnull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PersonNonNullJava {

	@Setter
	@Getter
	private String name;

	public PersonNonNullJava(String name) {
		this.name = name;
	}

}
