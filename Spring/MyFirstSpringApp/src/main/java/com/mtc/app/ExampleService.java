package com.mtc.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mtc.app.dao.IMessageDAO;



@Component("exampleService")
@Scope("prototype")
public class ExampleService implements Service {
	
	@Autowired
	@Qualifier("messageDAOHib")
	private IMessageDAO messageDAO;
	
	public String getMessage() {
		return messageDAO.fetchMessage();	
	}


//	public void setMessageDAO(IMessageDAO messageDAO) {
//		this.messageDAO = messageDAO;
//	}
//	
	

}
