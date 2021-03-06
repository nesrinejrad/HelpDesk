package tn.MedicaSud.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Intervention {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Date dateIntervention;
	private String description;
	@ManyToOne
	private Materiel materiel;
	@ManyToOne
	private Ticket  ticket;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDateIntervention() {
		return dateIntervention;
	}
	public void setDateIntervention(Date dateIntervention) {
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
	public Intervention(Integer id, Date dateIntervention, String description, Materiel materiel, Ticket ticket) {
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
	
	
	

}
