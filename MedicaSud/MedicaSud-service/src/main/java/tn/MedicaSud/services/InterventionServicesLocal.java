package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Intervention;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface InterventionServicesLocal extends IGenericDAO<Intervention> {

}
