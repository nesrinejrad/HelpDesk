package tn.MedicaSud.services;

import javax.ejb.Remote;

import tn.MedicaSud.entities.User;
import tn.MedicaSud.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
