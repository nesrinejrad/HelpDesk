package tn.MedicaSud.services;

import javax.ejb.Remote;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Intervention;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface InterventionServicesRemote extends IGenericDAO<Intervention> {

}
