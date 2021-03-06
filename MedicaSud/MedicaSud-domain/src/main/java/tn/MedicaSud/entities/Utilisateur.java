package tn.MedicaSud.entities;

import java.awt.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Utilisateur extends User{
	@Enumerated(EnumType.STRING)
	private Role role;
	private String fonction;
	@OneToMany(mappedBy="utilisateur" , cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private java.util.List<Demande> demandes;
	@OneToMany(mappedBy="utilisateur")
	private java.util.List<Ticket> tickets;
	@OneToMany(mappedBy="utilisateur")
	private java.util.List<Materiel> materiels;
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public java.util.List<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(java.util.List<Demande> demandes) {
		this.demandes = demandes;
	}
	public java.util.List<Ticket> getTickets() {
		return tickets;
	}
	public void setTickets(java.util.List<Ticket> tickets) {
		this.tickets = tickets;
	}
	public java.util.List<Materiel> getMateriels() {
		return materiels;
	}
	public void setMateriels(java.util.List<Materiel> materiels) {
		this.materiels = materiels;
	}
	public Utilisateur(Role role, String fonction, java.util.List<Demande> demandes, java.util.List<Ticket> tickets,
			java.util.List<Materiel> materiels) {
		super();
		this.role = role;
		this.fonction = fonction;
		this.demandes = demandes;
		this.tickets = tickets;
		this.materiels = materiels;
	}
	public Utilisateur() {
		super();
	}
	@Override
	public String toString() {
		return "Utilisateur [role=" + role + ", fonction=" + fonction + ", demandes=" + demandes + ", tickets="
				+ tickets + ", materiels=" + materiels + "]";
	}
	
	
	
	
	

}
