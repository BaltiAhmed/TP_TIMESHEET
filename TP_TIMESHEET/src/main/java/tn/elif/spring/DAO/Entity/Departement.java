package tn.elif.spring.DAO.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="departement")
public class Departement implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ManyToOne
	private Entreprise entreprise;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Employer> employer;

	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departement(String name, Entreprise entreprise) {
		super();
		this.name = name;
		this.entreprise = entreprise;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	@Override
	public String toString() {
		return "Departement [id=" + id + ", name=" + name + ", entreprise=" + entreprise + "]";
	}
	
	

}
