package com.kleenxcoder.projectlombok.gettersetter;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class PersonGetterSetter {
	
	@Getter
	@Setter
	private String firstName;
	
	@Getter
	@Setter
	private String lastName;
	
	@Getter
	@Setter
	private String birthName;
	
	@Getter
	@Setter
	private String nickName;
	
	@Getter
	@Setter
	private String phoneNumber;
	
	@Getter
	@Setter
	private Date birthDate;

}
