package tn.MedicaSud.entities;

import java.awt.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Utilisateur extends User{
	
	private Role role;
	private String fonction;
	@OneToMany(mappedBy="utilisateur" , cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	private java.util.List<Demande> demandes;
	@OneToMany(mappedBy="utilisateur")
	private java.util.List<Ticket> tickets;
	@OneToMany(mappedBy="utilisateur")
	private java.util.List<Materiel> materiels;
	
	

}
