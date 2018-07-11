package tn.MedicaSud.services;

import javax.ejb.Remote;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface MaterielServicesRemote  extends IGenericDAO<Materiel>{
	public Materiel findByReference( String reference);

}
