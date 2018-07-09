package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface DemandeServicesLocal extends IGenericDAO<Demande>{

}
