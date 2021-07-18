package tn.elif.spring.DAO.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mission_externe")
public class MissionExterne implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="email_facturation")
	private String emailFacturation;
	
	@Column(name="taux_jounalier_moyen")
	private String tauxJournalierMoyen;
	
	@OneToOne
	private Mission mission;

	public MissionExterne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MissionExterne(int id, String emailFacturation, String tauxJournalierMoyen) {
		super();
		this.id = id;
		this.emailFacturation = emailFacturation;
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailFacturation() {
		return emailFacturation;
	}

	public void setEmailFacturation(String emailFacturation) {
		this.emailFacturation = emailFacturation;
	}

	public String getTauxJournalierMoyen() {
		return tauxJournalierMoyen;
	}

	public void setTauxJournalierMoyen(String tauxJournalierMoyen) {
		this.tauxJournalierMoyen = tauxJournalierMoyen;
	}

	@Override
	public String toString() {
		return "MissionExterne [id=" + id + ", emailFacturation=" + emailFacturation + ", tauxJournalierMoyen="
				+ tauxJournalierMoyen + ", mission=" + mission + "]";
	}

	
	
	
	

}
