package tn.MedicaSud.entities;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Intervention implements Serializable {
	@Id
	private String id;
	private LocalDate dateIntervention;
	private String description;
	private Integer periode;
	@ManyToOne
	private Materiel materiel;
	@ManyToOne
	private Ticket  ticket;
	private static final long serialVersionUID = 1L;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public LocalDate getDateIntervention() {
		return dateIntervention;
	}
	public void setDateIntervention(LocalDate dateIntervention) {
		this.dateIntervention = dateIntervention;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Intervention(String id, LocalDate dateIntervention, String description, Materiel materiel, Ticket ticket) {
		super();
		this.id = id;
		this.dateIntervention = dateIntervention;
		this.description = description;
		this.materiel = materiel;
		this.ticket = ticket;
	}
	public Intervention() {
		super();
	}
	@Override
	public String toString() {
		return "Intervention [id=" + id + ", dateIntervention=" + dateIntervention + ", description=" + description
				+ ", materiel=" + materiel + ", ticket=" + ticket + "]";
	}
	public Integer getPeriode() {
		return periode;
	}
	public void setPeriode(Integer periode) {
		this.periode = periode;
	}
	
	
	

}
