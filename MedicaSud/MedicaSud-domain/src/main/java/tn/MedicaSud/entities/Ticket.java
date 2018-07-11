package tn.MedicaSud.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Ticket implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Date sateCreation;
	private String discription;
	private TypeMateriel typeMateriel;
	private EtatTicket etatTicket;
	@Enumerated(EnumType.STRING)
	private StatutTicket statutTicket;
	@ManyToOne
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
		return sateCreation;
	}
	public void setSateCreation(Date sateCreation) {
		this.sateCreation = sateCreation;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
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
		this.sateCreation = sateCreation;
		this.discription = discription;
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
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", sateCreation=" + sateCreation + ", discription=" + discription
				+ ", typeMateriel=" + typeMateriel + ", etatTicket=" + etatTicket + ", statutTicket=" + statutTicket
				+ ", utilisateur=" + utilisateur + ", notifications=" + notifications + ", interventions="
				+ interventions + "]";
	}
	
	
	
	
}
