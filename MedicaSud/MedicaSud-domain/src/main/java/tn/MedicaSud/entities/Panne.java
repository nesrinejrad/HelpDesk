package tn.MedicaSud.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Panne implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String description;
	private String solution;
	private TypeMateriel typeMateriel;
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public Panne(String description, String solution) {
		super();
		this.description = description;
		this.solution = solution;
	}
	public Panne() {
		super();
	}
	
	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}
	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}
	@Override
	public String toString() {
		return "Panne [id=" + id + ", description=" + description + ", solution=" + solution + ", typeMateriel="
				+ typeMateriel + "]";
	}
	
	
	
	

}
