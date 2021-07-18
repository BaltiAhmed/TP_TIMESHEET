package tn.elif.spring.DAO.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="entreprise")
public class Entreprise implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="entreprise")
	private List<Departement> departements;

	public Entreprise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Entreprise(String name, List<Departement> departements) {
		super();
		this.name = name;
		this.departements = departements;
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

	public List<Departement> getDepartements() {
		return departements;
	}

	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}

	@Override
	public String toString() {
		return "Entreprise [id=" + id + ", name=" + name + ", departements=" + departements + "]";
	}
	
	

}
