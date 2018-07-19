package tn.MedicaSud.app.client.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.entities.Ticket;
import tn.MedicaSud.services.TicketSerciesRemote;

public class TicketTest {
	public static void main(String[] args) throws NamingException {
		
		Context context= new InitialContext();
		TicketSerciesRemote ticketSerciesRemote=(TicketSerciesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/TicketSercies!tn.MedicaSud.services.TicketSerciesRemote");
		Ticket ticket= new Ticket();
		ticket.setDiscription("description");
		//ticketSerciesRemote.save(ticket);
		//ticketSerciesRemote.add(ticket);
	
	}

}