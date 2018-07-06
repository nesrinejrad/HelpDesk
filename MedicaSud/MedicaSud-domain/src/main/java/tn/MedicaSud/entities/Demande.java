package tn.MedicaSud.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Demande {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private TypeMateriel typeMateriel;
	private Date dateDemande;
	private String description;
	@ManyToOne
	private Utilisateur utilisateur;
	@OneToOne(mappedBy="demandeMateriel")
	private Notification notification;
	
	
}
