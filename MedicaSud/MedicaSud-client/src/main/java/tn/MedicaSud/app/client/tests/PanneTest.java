package tn.MedicaSud.app.client.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.MedicaSud.entities.Panne;
import tn.MedicaSud.services.PanneServicesRemote;

public class PanneTest {
	public static void main(String[] args) throws NamingException {
		Context context= new InitialContext();
		PanneServicesRemote panneServicesRemote=(PanneServicesRemote) context.lookup("MedicaSud-ear/MedicaSud-service/PanneServices!tn.MedicaSud.services.PanneServicesRemote");
		Panne panne= new Panne();
		panne.setDescription("description1");
		panne.setSolution("solution1");
		panneServicesRemote.save(panne);
	}

}
