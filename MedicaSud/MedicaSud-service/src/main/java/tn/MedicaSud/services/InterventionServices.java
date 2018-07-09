package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import tn.MedicaSud.entities.Intervention;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class InterventionServices
 */
@Stateless
@LocalBean
public class InterventionServices extends GenericDAO<Intervention> implements InterventionServicesRemote, InterventionServicesLocal {

    /**
     * Default constructor. 
     */
    public InterventionServices() {
    	super(Intervention.class);
        // TODO Auto-generated constructor stub
    }

}
