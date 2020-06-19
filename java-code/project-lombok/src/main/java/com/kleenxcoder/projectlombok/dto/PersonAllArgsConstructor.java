package com.kleenxcoder.projectlombok.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EqualsAndHashCode
@ToString
@AllArgsConstructor
public class PersonAllArgsConstructor {
	
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
