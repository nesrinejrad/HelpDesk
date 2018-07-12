package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class PanneServices
 */
@Stateless
@LocalBean
public class PanneServices extends GenericDAO<Panne> implements PanneServicesRemote, PanneServicesLocal {

	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public PanneServices() {
    	super(Panne.class);
        // TODO Auto-generated constructor stub
    }

    public Panne findByDescription(String description)
    {	Panne panne=null;
    	String query="select p from Panne p where p.description=:description";
    	panne=(Panne) entityManager.createQuery(query).setParameter("description", description).getSingleResult();
    			return panne;
    }
}
