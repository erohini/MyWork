package com.mtc.app.dao;

import org.springframework.stereotype.Component;

@Component("messageDAOJDBC")
public class MessageDAO implements IMessageDAO {

	public String fetchMessage(){
		System.out.println("***MessageDAO uses JDBC API***");
		System.out.println("fetchMessage()");
		return "Hello";
	}
}
