package tn.MedicaSud.entities;

import java.sql.Date;

public class Demande {
	
	private Integer id;
	private TypeMateriel typeMateriel;
	private Date dateDemande;
	private String description;
	private Utilisateur utilisateur;
	private Notification notification;
	
	
}