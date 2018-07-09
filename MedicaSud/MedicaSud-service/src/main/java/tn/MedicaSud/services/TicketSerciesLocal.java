package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Ticket;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface TicketSerciesLocal extends IGenericDAO<Ticket> {

}
