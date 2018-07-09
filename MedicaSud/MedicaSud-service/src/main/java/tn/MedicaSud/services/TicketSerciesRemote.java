package tn.MedicaSud.services;

import javax.ejb.Remote;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Ticket;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface TicketSerciesRemote extends IGenericDAO<Ticket>{

}
