package tn.MedicaSud.services;

import javax.ejb.Remote;
import javax.swing.text.Utilities;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface UtilisateurServicesRemote extends IGenericDAO<Utilisateur> {
	  public Utilisateur login ( String login , String pwd);
	  

}
