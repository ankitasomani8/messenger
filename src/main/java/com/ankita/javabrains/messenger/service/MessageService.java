package com.ankita.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.ankita.javabrains.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L, "Ankita Somani","Ankita");
		Message m2 = new Message(2L, "Ankita Satish Somani","Amruta");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}
	
}
