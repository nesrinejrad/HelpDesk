package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import tn.MedicaSud.entities.Ticket;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class TicketSercies
 */
@Stateless
@LocalBean
public class TicketSercies extends GenericDAO<Ticket> implements TicketSerciesRemote, TicketSerciesLocal {

    /**
     * Default constructor. 
     */
    public TicketSercies() {
    	super(Ticket.class);
        // TODO Auto-generated constructor stub
    }

}
