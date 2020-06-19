package com.kleenxcoder.projectlombok.data;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonData {
	
	private String firstName;
	private String lastName;
	private String birthName;
	private String nickName;
	private String phoneNumber;
	private Date birthDate;

}
