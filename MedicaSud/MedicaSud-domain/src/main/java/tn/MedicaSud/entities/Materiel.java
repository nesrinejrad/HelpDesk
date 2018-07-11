package tn.MedicaSud.entities;

import java.awt.List;
import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.crypto.Data;
@Entity
public class Materiel implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String reference;
	private String marque;
	private LocalDate  dateAchat;
	private Integer dureeGarantie;
	@ManyToMany(mappedBy="materiels", fetch=FetchType.EAGER, cascade={CascadeType.PERSIST,CascadeType.REMOVE,CascadeType.MERGE})
	private java.util.List<Utilisateur> utilisateurs= new ArrayList<Utilisateur>();
	@ManyToOne
	private Fournisseur fournisseur;
	@OneToMany(mappedBy="materiel")
	private java.util.List<Intervention> interventions;
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public LocalDate getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(LocalDate dateAchat) {
		this.dateAchat = dateAchat;
	}
	public Integer getDureeGarantie() {
		return dureeGarantie;
	}
	public void setDureeGarantie(Integer dureeGarantie) {
		this.dureeGarantie = dureeGarantie;
	}
	
	public Fournisseur getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}
	
	
	public java.util.List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(java.util.List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
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
				+ ", dureeGarantie=" + dureeGarantie  + ", fournisseur=" + fournisseur
				+ ", interventions=" + interventions + "]";
	}
	public Materiel(String reference, String marque, LocalDate dateAchat, Integer dureeGarantie,java.util.List<Utilisateur > utilisateurs,
			Fournisseur fournisseur, java.util.List<Intervention> interventions) {
		super();
		this.reference = reference;
		this.marque = marque;
		this.dateAchat = dateAchat;
		this.dureeGarantie = dureeGarantie;
		this.utilisateurs = utilisateurs;
		this.fournisseur = fournisseur;
		this.interventions = interventions;
	}
	public Materiel() {
		super();
	}
	
	
	

 }
