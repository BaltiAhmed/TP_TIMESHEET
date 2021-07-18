package tn.elif.spring.DAO.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class TimeSheet implements Serializable {

		private static final long serialVersionUID = 1L;

	private TimeSheetPK timeSheetPk;

	@Column(name = "date_debut")
	private Date dateDebut;

	@Column(name = "date_fin")
	private Date DateFin;

	@Column(name = "isvalid")
	private boolean isValid;

	private Employer employer;

	private Mission mission;

	public TimeSheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TimeSheet(Date dateDebut, Date dateFin, boolean isValid, Employer employer, Mission mission) {
		super();
		this.dateDebut = dateDebut;
		DateFin = dateFin;
		this.isValid = isValid;
		this.employer = employer;
		this.mission = mission;
	}

	@EmbeddedId
	public TimeSheetPK getTimeSheetPk() {
		return timeSheetPk;
	}

	public void setTimeSheetPk(TimeSheetPK timeSheetPk) {
		this.timeSheetPk = timeSheetPk;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return DateFin;
	}

	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@ManyToOne
	@JoinColumn(name = "id_employer", referencedColumnName = "id", insertable = false, updatable = false)
	public Employer getEmployer() {
		return employer;
	}

	public void setEmployer(Employer employer) {
		this.employer = employer;
	}

	@ManyToOne
	@JoinColumn(name = "id_mission", referencedColumnName = "id", insertable = false, updatable = false)
	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	@Override
	public String toString() {
		return "TimeSheet [dateDebut=" + dateDebut + ", DateFin=" + DateFin + ", isValid=" + isValid + ", employer="
				+ employer + ", mission=" + mission + "]";
	}

}
