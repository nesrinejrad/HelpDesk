package tn.MedicaSud.app.client.tests;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.MedicaSud.app.client.gui.Utilites;
import tn.MedicaSud.entities.Utilisateur;
import tn.MedicaSud.services.UtilisateurServicesRemote;

public class TestLogin {
	public static void main(String[] args) throws NamingException {
		Utilisateur utilisateur= new Utilisateur();
	
		Utilites utilites= new Utilites();
		utilites.context= new InitialContext();
		utilites.utilisateurServicesRemote=(UtilisateurServicesRemote) utilites.context.lookup(utilites.utilRemote);
				if ((utilisateur=Utilites.utilisateurServicesRemote.login("nesrine.jrad@gmail.tn", "123456"))!=null)
			     {System.out.println("OK");
		}
				else
				 {System.out.println("NOT OK");}
					}}


