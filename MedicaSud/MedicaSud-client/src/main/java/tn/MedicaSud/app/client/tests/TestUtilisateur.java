package tn.MedicaSud.app.client.tests;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.MedicaSud.entities.Role;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.services.UtilisateurServicesRemote;

public class TestUtilisateur {
	
	public static void main(String[] args) throws NamingException {
		Context context= new InitialContext();
		UtilisateurServicesRemote utilisateurServicesRemote= (UtilisateurServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/UtilisateurServices!tn.MedicaSud.services.UtilisateurServicesRemote");
		Utilisateur utilisateur= new Utilisateur();
		/*utilisateur.setEmail("email");
		utilisateur.setPassword("123456");
		utilisateur.setRole(Role.valueOf("Client"));
		utilisateurServicesRemote.save(utilisateur);*/
		List<Utilisateur> utilisateurs= new ArrayList<Utilisateur>();
		utilisateurs.add(utilisateurServicesRemote.login("123", "123456"));
		if(utilisateurs.size()==0)
			System.out.println("faux");
		else
			System.out.println(utilisateur.getEmail());
		
	
	}

}
