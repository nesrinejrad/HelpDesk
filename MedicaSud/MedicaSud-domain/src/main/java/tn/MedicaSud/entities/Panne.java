package tn.MedicaSud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panne {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	private String description;
	private String solution;
	

}
