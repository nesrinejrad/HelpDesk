package tn.MedicaSud.entities;

import java.sql.Date;

public class Notification {
	
	private Integer id;
	private EtatNotification etatNotification;
	private Demande demandeMateriel;
	private Utilisateur expéditeur;
	private Utilisateur destinateur;
	private Date dateIntervention;
	private String description;
	private Ticket ticket;

}
