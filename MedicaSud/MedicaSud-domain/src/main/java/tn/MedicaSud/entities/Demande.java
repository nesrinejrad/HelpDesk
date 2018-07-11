package tn.MedicaSud.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Demande implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private TypeMateriel typeMateriel;
	private Date dateDemande;
	private String description;
	@ManyToOne
	private Utilisateur utilisateur;
	@OneToOne(mappedBy="demandeMateriel")
	private Notification notification;
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}
	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Notification getNotification() {
		return notification;
	}
	public void setNotification(Notification notification) {
		this.notification = notification;
	}
	public Demande(int id, TypeMateriel typeMateriel, Date dateDemande, String description, Utilisateur utilisateur,
			Notification notification) {
		super();
		this.id = id;
		this.typeMateriel = typeMateriel;
		this.dateDemande = dateDemande;
		this.description = description;
		this.utilisateur = utilisateur;
		this.notification = notification;
	}
	public Demande() {
		
	}
	@Override
	public String toString() {
		return "Demande [id=" + id + ", typeMateriel=" + typeMateriel + ", dateDemande=" + dateDemande
				+ ", description=" + description + ", utilisateur=" + utilisateur + ", notification=" + notification
				+ "]";
	}
	
	
	
	
	
}
