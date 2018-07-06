package tn.MedicaSud.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Notification {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private EtatNotification etatNotification;
	@OneToOne
	private Demande demandeMateriel;
	@OneToOne
	private Utilisateur expéditeur;
	@OneToOne
	private Utilisateur destinateur;
	private Date dateIntervention;
	private String description;
	@ManyToOne
	private Ticket ticket;

}
