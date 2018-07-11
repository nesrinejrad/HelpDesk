package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class MaterielServices
 */
@Stateless
@LocalBean
public class MaterielServices extends GenericDAO<Materiel> implements MaterielServicesRemote, MaterielServicesLocal {
@PersistenceContext
EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public MaterielServices() {
    	super(Materiel.class);
        // TODO Auto-generated constructor stub
    }

    	public Materiel findByReference( String reference) {
    		
    		Materiel materiel= null;
    		String query="select m from Materiel m where m.reference=:reference";
    		materiel=(Materiel) entityManager.createQuery(query).setParameter("reference", reference).getSingleResult();
			return materiel;
		}
}
