package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Entity implementation class for Entity: Actuality
 *
 */
@Entity

public class Actuality implements Serializable {
private int actualityId;
private String actualityTitle;
private Date actualityDate;


	
	public Actuality(int actualityId, String actualityTitle, Date actualityDate) {
	super();
	this.actualityId = actualityId;
	this.actualityTitle = actualityTitle;
	this.actualityDate = actualityDate;
}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int getActualityId() {
		return actualityId;
	}

	public void setActualityId(int actualityId) {
		this.actualityId = actualityId;
	}

	public String getActualityTitle() {
		return actualityTitle;
	}

	public void setActualityTitle(String actualityTitle) {
		this.actualityTitle = actualityTitle;
	}

	public Date getActualityDate() {
		return actualityDate;
	}

	public void setActualityDate(Date actualityDate) {
		this.actualityDate = actualityDate;
	}


	private static final long serialVersionUID = 1L;

	public Actuality() {
		super();
	}
   
}
