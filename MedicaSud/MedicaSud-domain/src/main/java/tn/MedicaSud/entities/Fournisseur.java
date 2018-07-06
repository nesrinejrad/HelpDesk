package tn.MedicaSud.entities;

import java.awt.List;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournisseur implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String  nom;
	private String adresse;
	private String telephone;
	private String email;
	@OneToMany(mappedBy="fournisseur")
	private java.util.List<Materiel> materiels;
	
}
