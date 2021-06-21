package com.ankita.javabrains.messenger.message;

import java.util.List;

import com.ankita.javabrains.messenger.model.Message;
import com.ankita.javabrains.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages()
	{
		try {
		return messageService.getAllMessages();
		}
		catch(Exception e)
		{
			System.out.println("error"+e);
		}
		
		return null;
	}

}
