package tn.MedicaSud.services;

import javax.ejb.LocalBean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.MedicaSud.entities.Ticket;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class TicketSercies
 */
@Stateless
@LocalBean
public class TicketSercies extends GenericDAO<Ticket> implements TicketSerciesRemote, TicketSerciesLocal {
@PersistenceContext
EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public TicketSercies() {
    	super(Ticket.class);
        // TODO Auto-generated constructor stub
    }
    public void add (Ticket ticket){
		entityManager.persist(ticket);
	}

}
