package com.kleenxcoder.projectlombok.notnull;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NonNull;

@ToString
public class PersonNonNullLombok {

	@Setter
	@Getter
	private String name;

	public PersonNonNullLombok(@NonNull String name) {
		this.name = name;
	}

}
