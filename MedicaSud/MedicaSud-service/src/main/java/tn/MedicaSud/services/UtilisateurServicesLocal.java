package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface UtilisateurServicesLocal extends IGenericDAO<Utilisateur>{
	  public Utilisateur login ( String login , String pwd);
	

}
