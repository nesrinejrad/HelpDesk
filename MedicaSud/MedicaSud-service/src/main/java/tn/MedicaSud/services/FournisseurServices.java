package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import tn.MedicaSud.entities.Fournisseur;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class FournisseurServices
 */
@Stateless
@LocalBean
public class FournisseurServices extends GenericDAO<Fournisseur> implements FournisseurServicesRemote, FournisseurServicesLocal {

    /**
     * Default constructor. 
     */
    public FournisseurServices() {
    	super(Fournisseur.class);
        // TODO Auto-generated constructor stub
    }

}
