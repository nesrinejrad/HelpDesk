package tn.MedicaSud.services;

import javax.ejb.Remote;

import tn.MedicaSud.entities.Demande;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface DemandeServicesRemote extends IGenericDAO<Demande> {

}
