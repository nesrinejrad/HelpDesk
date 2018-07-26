package tn.MedicaSud.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

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
import javax.persistence.OneToOne;
@Entity
public class Ticket implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date dateCreation;
	private String description;
	@Enumerated(EnumType.STRING)
	private TypeMateriel typeMateriel;
	@Enumerated(EnumType.STRING)
	private EtatTicket etatTicket;
	@ManyToOne
	private Panne panne;
	@Enumerated(EnumType.STRING)
	private StatutTicket statutTicket;
	@ManyToOne
	private Materiel materiel;
	@ManyToOne(cascade={CascadeType.MERGE},fetch=FetchType.EAGER)
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="ticket")
	private List<Notification> notifications;
	@OneToMany(mappedBy="ticket")
	private List<Intervention> interventions;
	
	
	private static final long serialVersionUID = 1L;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getSateCreation() {
		return dateCreation;
	}
	public void setSateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public String getDiscription() {
		return description;
	}
	public void setDiscription(String discription) {
		this.description = discription;
	}
	public TypeMateriel getTypeMateriel() {
		return typeMateriel;
	}
	public void setTypeMateriel(TypeMateriel typeMateriel) {
		this.typeMateriel = typeMateriel;
	}
	public EtatTicket getEtatTicket() {
		return etatTicket;
	}
	public void setEtatTicket(EtatTicket etatTicket) {
		this.etatTicket = etatTicket;
	}
	public StatutTicket getStatutTicket() {
		return statutTicket;
	}
	public void setStatutTicket(StatutTicket statutTicket) {
		this.statutTicket = statutTicket;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public List<Notification> getNotifications() {
		return notifications;
	}
	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}
	public List<Intervention> getInterventions() {
		return interventions;
	}
	public void setInterventions(List<Intervention> interventions) {
		this.interventions = interventions;
	}
	public Ticket(Date sateCreation, String discription, TypeMateriel typeMateriel, EtatTicket etatTicket,
			StatutTicket statutTicket, Utilisateur utilisateur, List<Notification> notifications,
			List<Intervention> interventions) {
		super();
		this.dateCreation = sateCreation;
		this.description = discription;
		this.typeMateriel = typeMateriel;
		this.etatTicket = etatTicket;
		this.statutTicket = statutTicket;
		this.utilisateur = utilisateur;
		this.notifications = notifications;
		this.interventions = interventions;
	}
	public Ticket() {
		super();
	}
	
	public Materiel getMateriel() {
		return materiel;
	}
	public void setMateriel(Materiel materiel) {
		this.materiel = materiel;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", sateCreation=" + dateCreation + ", discription=" + description
				+ ", typeMateriel=" + typeMateriel + ", etatTicket=" + etatTicket + ", statutTicket=" + statutTicket
				+"]";
	}
	public Panne getPanne() {
		return panne;
	}
	public void setPanne(Panne panne) {
		this.panne = panne;
	}
	
	
	
	
}
