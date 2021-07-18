package tn.elif.spring.DAO.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="contrat")
public class Contrat implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="reference")
	private int reference;
	
	@Column(name="date_debut")
	private Date dateDebut;
	
	@Column(name="type_contrat")
	private String typeContrat;
	
	@Column(name="salaire")
	private Long salaire; 
	
	@OneToOne(mappedBy="contrat")
	private Employer employer;

	public Contrat(int reference, Date dateDebut, String typeContrat, Long salaire) {
		super();
		this.reference = reference;
		this.dateDebut = dateDebut;
		this.typeContrat = typeContrat;
		this.salaire = salaire;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public Long getSalaire() {
		return salaire;
	}

	public void setSalaire(Long salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		return "Contrat [reference=" + reference + ", dateDebut=" + dateDebut + ", typeContrat=" + typeContrat
				+ ", salaire=" + salaire + ", employer=" + employer + "]";
	}
	
	
	
	

}
