package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface MaterielServicesLocal extends IGenericDAO<Materiel> {

}