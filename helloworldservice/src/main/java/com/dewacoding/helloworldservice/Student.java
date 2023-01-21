package com.dewacoding.helloworldservice;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {
	private int id;
	private String regNumber;
	private String name;
	private String address;
}
