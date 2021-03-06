package tn.MedicaSud.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.utilities.GenericDAO;

/**
 * Session Bean implementation class UtilisateurServices
 */
@Stateless
@LocalBean
public class UtilisateurServices extends GenericDAO<Utilisateur> implements UtilisateurServicesRemote, UtilisateurServicesLocal {
@PersistenceContext
EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public UtilisateurServices() {
    	
    	super(Utilisateur.class);
        // TODO Auto-generated constructor stub
    }
    
    public Utilisateur login ( String login , String pwd)
    
    {	Utilisateur utilisateur=null;
    	try {
    	String query="Select u from User u where u.email=:login and u.password=:pwd";
    	utilisateur= (Utilisateur) entityManager.createQuery(query).setParameter("login", login).setParameter("pwd", pwd).getSingleResult();	
	} catch (Exception e) {
	
	}
    	
    	
    	return utilisateur;
    }

}
