package tn.elif.spring.DAO.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TimeSheetPK implements Serializable {
	
	private int idEmployer;
	private int idMission;
	public TimeSheetPK() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column(name="id_employer")
	public int getIdEmployer() {
		return idEmployer;
	}
	public void setIdEmployer(int idEmployer) {
		this.idEmployer = idEmployer;
	}
	@Column(name="id_mission")
	public int getIdMission() {
		return idMission;
	}
	public void setIdMission(int idMission) {
		this.idMission = idMission;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idEmployer;
		result = prime * result + idMission;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeSheetPK other = (TimeSheetPK) obj;
		if (idEmployer != other.idEmployer)
			return false;
		if (idMission != other.idMission)
			return false;
		return true;
	}
	

}
