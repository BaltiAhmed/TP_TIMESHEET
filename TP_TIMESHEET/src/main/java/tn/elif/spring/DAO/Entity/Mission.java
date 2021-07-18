package tn.elif.spring.DAO.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mission")
public class Mission implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@OneToMany(mappedBy="mission")
	private List<TimeSheet> timeSheet;
	
	@OneToOne
	private MissionExterne missionexterne;

	public Mission() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mission	(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<TimeSheet> getTimeSheet() {
		return timeSheet;
	}

	public void setTimeSheet(List<TimeSheet> timeSheet) {
		this.timeSheet = timeSheet;
	}

	@Override
	public String toString() {
		return "Mission [id=" + id + ", name=" + name + ", description=" + description + ", timeSheet=" + timeSheet
				+ "]";
	}
	
	
	
	

}
