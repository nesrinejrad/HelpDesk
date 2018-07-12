package tn.MedicaSud.services;

import javax.ejb.Remote;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface PanneServicesRemote extends IGenericDAO<Panne>{
	public Panne findByDescription(String description);

}
