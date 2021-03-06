package tn.MedicaSud.entities;

import java.awt.List;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;
@Entity
public class Materiel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String reference;
	private String marque;
	private Date  dateAchat;
	private Integer dureeGarantie;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private Fournisseur fournisseur;
	@OneToMany(mappedBy="materiel")
	private java.util.List<Intervention> interventions;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Integer getDureeGarantie() {
		return dureeGarantie;
	}
	public void setDureeGarantie(Integer dureeGarantie) {
		this.dureeGarantie = dureeGarantie;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	public java.util.List<Intervention> getInterventions() {
		return interventions;
	}
	public void setInterventions(java.util.List<Intervention> interventions) {
		this.interventions = interventions;
	}
	@Override
	public String toString() {
		return "Materiel [id=" + id + ", reference=" + reference + ", marque=" + marque + ", dateAchat=" + dateAchat
				+ ", dureeGarantie=" + dureeGarantie + ", utilisateur=" + utilisateur + ", fournisseur=" + fournisseur
				+ ", interventions=" + interventions + "]";
	}
	public Materiel(String reference, String marque, Date dateAchat, Integer dureeGarantie, Utilisateur utilisateur,
			Fournisseur fournisseur, java.util.List<Intervention> interventions) {
		super();
		this.reference = reference;
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.dureeGarantie = dureeGarantie;
		this.utilisateur = utilisateur;
		this.fournisseur = fournisseur;
		this.interventions = interventions;
	}
	public Materiel() {
		super();
	}
	
	
	

 }
