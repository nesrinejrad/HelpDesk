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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	@Override
	public String toString() {
		return "Panne [id=" + id + ", description=" + description + ", solution=" + solution + "]";
	}
	
	
	
	

}
