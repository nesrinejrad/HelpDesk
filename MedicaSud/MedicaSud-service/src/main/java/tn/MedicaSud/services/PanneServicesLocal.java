package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface PanneServicesLocal extends IGenericDAO<Panne>{

}
