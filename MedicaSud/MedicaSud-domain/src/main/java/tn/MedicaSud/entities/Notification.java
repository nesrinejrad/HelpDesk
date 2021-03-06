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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public EtatNotification getEtatNotification() {
		return etatNotification;
	}
	public void setEtatNotification(EtatNotification etatNotification) {
		this.etatNotification = etatNotification;
	}
	public Demande getDemandeMateriel() {
		return demandeMateriel;
	}
	public void setDemandeMateriel(Demande demandeMateriel) {
		this.demandeMateriel = demandeMateriel;
	}
	public Utilisateur getExpéditeur() {
		return expéditeur;
	}
	public void setExpéditeur(Utilisateur expéditeur) {
		this.expéditeur = expéditeur;
	}
	public Utilisateur getDestinateur() {
		return destinateur;
	}
	public void setDestinateur(Utilisateur destinateur) {
		this.destinateur = destinateur;
	}
	public Date getDateIntervention() {
		return dateIntervention;
	}
	public void setDateIntervention(Date dateIntervention) {
		this.dateIntervention = dateIntervention;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Notification(EtatNotification etatNotification, Demande demandeMateriel, Utilisateur expéditeur,
			Utilisateur destinateur, Date dateIntervention, String description, Ticket ticket) {
		super();
		this.etatNotification = etatNotification;
		this.demandeMateriel = demandeMateriel;
		this.expéditeur = expéditeur;
		this.destinateur = destinateur;
		this.dateIntervention = dateIntervention;
		this.description = description;
		this.ticket = ticket;
	}
	public Notification() {
		super();
	}
	@Override
	public String toString() {
		return "Notification [id=" + id + ", etatNotification=" + etatNotification + ", demandeMateriel="
				+ demandeMateriel + ", expéditeur=" + expéditeur + ", destinateur=" + destinateur
				+ ", dateIntervention=" + dateIntervention + ", description=" + description + ", ticket=" + ticket
				+ "]";
	}

	
	
}
