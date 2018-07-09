package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class MaterielServices
 */
@Stateless
@LocalBean
public class MaterielServices extends GenericDAO<Materiel> implements MaterielServicesRemote, MaterielServicesLocal {

    /**
     * Default constructor. 
     */
    public MaterielServices() {
    	super(Materiel.class);
        // TODO Auto-generated constructor stub
    }

}
