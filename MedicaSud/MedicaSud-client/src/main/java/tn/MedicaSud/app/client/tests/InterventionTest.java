package tn.MedicaSud.app.client.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.MedicaSud.app.client.gui.Utilites;
import tn.MedicaSud.entities.Intervention;
import tn.MedicaSud.services.InterventionServicesRemote;

public class InterventionTest {
	public static void main(String[] args) throws NamingException {
		Context context= new InitialContext();
		InterventionServicesRemote interventionServicesRemote=(InterventionServicesRemote) context.lookup(    "MedicaSud-ear/MedicaSud-service/InterventionServices!tn.MedicaSud.services.InterventionServicesRemote");
		Intervention intervention= new Intervention();
		intervention.setId("cc");
		intervention.setDescription("ddddddd");
		intervention.setPeriode(5);
		interventionServicesRemote.update(intervention)
;	}


}