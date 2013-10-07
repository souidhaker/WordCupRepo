package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ads
 *
 */
@Entity

public class Ads implements Serializable {

	
	private int idAds;
	private String name;
	private String url;
	private String company;
	private static final long serialVersionUID = 1L;

	public Ads() {
		super();
	}  
	@Id
	public int getIdAds() {
		return this.idAds;
	}

	public void setIdAds(int idAds) {
		this.idAds = idAds;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}   
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
   
}
