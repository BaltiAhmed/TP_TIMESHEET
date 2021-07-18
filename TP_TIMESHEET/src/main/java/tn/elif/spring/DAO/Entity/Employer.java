package tn.elif.spring.DAO.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employer")
public class Employer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="prenom")
	private String prenom;
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="email")
	private String email;
	
	@Column(name="is_actif")
	private boolean isActif;
	
	@Enumerated(EnumType.ORDINAL)
	private Role  role;
	
	
	@ManyToMany(mappedBy="employer", cascade = CascadeType.ALL)
	private List<Departement> departements;
	
	@OneToMany(mappedBy="employer")
	private List<TimeSheet> timeSheet;
	
	@OneToOne
	private Contrat contrat;


	public Employer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employer(String prenom, String nom, String email, boolean isActif, Role role,
			List<Departement> departements) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.isActif = isActif;
		this.role = role;
		this.departements = departements;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isActif() {
		return isActif;
	}


	public void setActif(boolean isActif) {
		this.isActif = isActif;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Employer [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", email=" + email + ", isActif="
				+ isActif + ", role=" + role + ", departements=" + departements + "]";
	}
	
	
	
	

}
