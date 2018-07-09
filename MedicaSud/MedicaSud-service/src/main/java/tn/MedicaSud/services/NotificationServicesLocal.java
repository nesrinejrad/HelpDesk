package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Notification;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface NotificationServicesLocal extends IGenericDAO<Notification>{

}
