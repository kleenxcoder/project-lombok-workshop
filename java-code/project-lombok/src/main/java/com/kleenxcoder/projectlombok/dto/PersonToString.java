package com.kleenxcoder.projectlombok.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PersonToString {

	@Getter
	@Setter
	@ToString.Include(name = "FIRST_NAME")
	private String firstName;

	@Getter
	@Setter
	private String lastName;

	@Getter
	@Setter
	@ToString.Include(rank = -1)
	private String birthName;

	@Getter
	@Setter
	private String nickName;

	@Getter
	@Setter
	@ToString.Include
	private String phoneNumber;

	@Getter
	@Setter
	@ToString.Exclude
	private Date birthDate;

}