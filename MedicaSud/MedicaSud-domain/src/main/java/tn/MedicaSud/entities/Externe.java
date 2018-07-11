package tn.MedicaSud.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Externe extends Intervention implements Serializable{

	private String conatct;
	private float cout;
	private static final long serialVersionUID = 1L;
	public String getConatct() {
		return conatct;
	}
	public void setConatct(String conatct) {
		this.conatct = conatct;
	}
	public float getCout() {
		return cout;
	}
	public void setCout(float cout) {
		this.cout = cout;
	}
	public Externe(String conatct, float cout) {
		super();
		this.conatct = conatct;
		this.cout = cout;
	}
	public Externe() {
		super();
	}
	@Override
	public String toString() {
		return "Externe [conatct=" + conatct + ", cout=" + cout + "]";
	}
	
	
	
}
