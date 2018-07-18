package tn.MedicaSud.app.client.tests;

import java.util.ArrayList;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.entities.Role;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.services.MaterielServicesRemote;
import tn.MedicaSud.services.PanneServicesRemote;
import tn.MedicaSud.services.UtilisateurServicesRemote;

public class TestUtilisateur {
	
	public static void main(String[] args) throws NamingException {
		Context context= new InitialContext();
		UtilisateurServicesRemote utilisateurServicesRemote= (UtilisateurServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/UtilisateurServices!tn.MedicaSud.services.UtilisateurServicesRemote");
		Utilisateur utilisateur= new Utilisateur();
		utilisateur.setCode("123");
		utilisateur.setEmail("email");
		utilisateur.setPassword("123456");
		utilisateur.setRole(Role.valueOf("Client"));
		utilisateurServicesRemote.save(utilisateur);
		//System.out.println(utilisateur.getCode());
	
		/*utilisateur= utilisateurServicesRemote.login("email", "123456");
		if(utilisateur!=null)
			System.out.println(utilisateur.getEmail());
		else {
			System.out.println("null");
		}*/
		/*List<Utilisateur> utilisateurs= new ArrayList<Utilisateur>();
		System.out.println(utilisateurs.size());*/
		/*utilisateur=utilisateurServicesRemote.find(1);
		System.out.println(utilisateur.getCode() );
		/*utilisateurs.add(utilisateur);
		System.out.println(utilisateurs.size());
		//MaterielServicesRemote materielServicesRemote= (MaterielServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/MaterielServices!tn.MedicaSud.services.MaterielServicesRemote");
		//Materiel materiel=materielServicesRemote.find(1);
		/*List<Materiel> materiels= new ArrayList<Materiel>();
		materiels.add(materiel);
		utilisateur.setMateriels(materiels);*/
		//utilisateurServicesRemote.save(utilisateur);
		/*utilisateur=utilisateurServicesRemote.find(4);
		System.out.println(utilisateur.getEmail());*/
		
	
	}

}
