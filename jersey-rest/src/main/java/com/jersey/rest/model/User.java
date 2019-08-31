package com.jersey.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@XmlRootElement
public class User {

	private int id;
	private String name;
	private String email;
}
