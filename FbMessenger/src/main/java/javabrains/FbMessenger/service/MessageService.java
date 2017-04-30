package javabrains.FbMessenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javabrains.FbMessenger.database.DatabaseClass;
import javabrains.FbMessenger.model.*;
public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1, "Hello world", "Kavya"));
		messages.put(2L, new Message(2, "Hello USA", "Rohini"));
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());		
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0){
			return null;
		}
		
		messages.put(message.getId(), message);
		return message;		
	}
	
	public Message deleteMessage(long id){
		return messages.remove(id);
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	
}
