package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class DemandeServices
 */
@Stateless
@LocalBean
public class DemandeServices extends GenericDAO<Demande> implements DemandeServicesRemote, DemandeServicesLocal {

    /**
     * Default constructor. 
     */
    public DemandeServices() {
    	super(Demande.class);
        // TODO Auto-generated constructor stub
    }

}
