package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import tn.MedicaSud.entities.Notification;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class NotificationServices
 */
@Stateless
@LocalBean
public class NotificationServices extends GenericDAO<Notification> implements NotificationServicesRemote, NotificationServicesLocal {

    /**
     * Default constructor. 
     */
    public NotificationServices() {
    	super(Notification.class);
        // TODO Auto-generated constructor stub
    }

}
