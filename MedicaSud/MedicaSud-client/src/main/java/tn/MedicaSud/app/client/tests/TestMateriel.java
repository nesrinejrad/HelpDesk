package tn.MedicaSud.app.client.tests;

import java.sql.Date;

import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.MedicaSud.entities.Materiel;
import tn.MedicaSud.entities.User;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.services.MaterielServicesRemote;
import tn.MedicaSud.services.UserServiceRemote;
import tn.MedicaSud.services.UtilisateurServicesRemote;

public class TestMateriel {
	public static void main(String[] args) throws NamingException {
	  MaterielServicesRemote materielServicesRemote;
	  Context context= new InitialContext();
	  materielServicesRemote= (MaterielServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/MaterielServices!tn.MedicaSud.services.MaterielServicesRemote");
	  Materiel materiel= new Materiel();
	  materiel.setDateAchat(java.time.LocalDate.now());
	  materiel.setDureeGarantie(5);
	  materiel.setMarque("asus");
	  materiel.setReference("essaiFinFin");
		UtilisateurServicesRemote utilisateurServicesRemote= (UtilisateurServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/UtilisateurServices!tn.MedicaSud.services.UtilisateurServicesRemote");
		Utilisateur utilisateur= new Utilisateur();
		List<Utilisateur> utilisateurs= new ArrayList<Utilisateur>();
		utilisateur=utilisateurServicesRemote.find("123");
		System.out.println(utilisateur.toString());
		System.out.println(utilisateurs.size());
		utilisateurs.add(utilisateur);
		System.out.println(utilisateur.getCode());
		 materielServicesRemote= (MaterielServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/MaterielServices!tn.MedicaSud.services.MaterielServicesRemote");
		materiel.setUtilisateurs(utilisateurs);
		 materiel.setId("1");
		List<Materiel> materiels= utilisateur.getMateriels();
		//System.out.println("3andou "+materiels.size());
		//materielServicesRemote.save(materiel);
		Materiel materiel2= new Materiel();
		materiel2= materielServicesRemote.findByReference(materiel.getReference());
		 //System.out.println(materiel2.getId());
		materiels.add(materiel);
		// System.out.println("3andou ba3d "+materiels.size());
		 utilisateur.setMateriels(materiels);
		utilisateurServicesRemote.update(utilisateur);
		//utilisateurs.add(utilisateur);
		//materiel.setUtilisateurs(utilisateurs);
		//System.out.println(materiel.toString());
	  	//materiel=materielServicesRemote.findByReference("essaiFinFin");
	// System.out.println(materiel.getReference());*/
	}

}