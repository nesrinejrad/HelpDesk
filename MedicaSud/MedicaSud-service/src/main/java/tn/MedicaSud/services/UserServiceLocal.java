package tn.MedicaSud.services;

import javax.ejb.Local;

import tn.MedicaSud.entities.User;
import tn.MedicaSud.utilities.IGenericDAO;

@Local
public interface UserServiceLocal extends IGenericDAO<User> {

	User login(String login, String password);

}
