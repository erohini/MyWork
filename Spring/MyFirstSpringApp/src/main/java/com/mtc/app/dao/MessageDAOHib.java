package com.mtc.app.dao;

import org.springframework.stereotype.Component;

@Component("messageDAOHib")
public class MessageDAOHib implements IMessageDAO{

	public String fetchMessage(){
		System.out.println("***MessageDAO uses Hibernate***");
		System.out.println("fetchMessage()");
		return "Hello";
	}
}
