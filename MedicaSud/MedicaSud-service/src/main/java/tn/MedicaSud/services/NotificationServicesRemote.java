package tn.MedicaSud.services;

import javax.ejb.Remote;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Notification;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface NotificationServicesRemote extends IGenericDAO<Notification> {

}
