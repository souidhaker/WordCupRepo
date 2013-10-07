package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.awt.List;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: SubscribedClient
 * 
 */
@Entity
public class SubscribedClient implements Serializable {

	private int clientId;
	private String clientName;
	private String clientLastName;
	private String clientEmail;
	private String clientBirthDate;
	private String clientSex;
	private String clientLogin;
	private String clientPassword;
	private static final long serialVersionUID = 1L;
private java.util.List<Gallery> gallery ;
private java.util.List<Actuality> actuality;
private java.util.List<Match> match;
private java.util.List<Product> product;
private java.util.List<Team> team;
private java.util.List<MicroEvent> microEvent;
	public SubscribedClient() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientLastName() {
		return this.clientLastName;
	}

	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}

	public String getClientEmail() {
		return this.clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientBirthDate() {
		return this.clientBirthDate;
	}

	public void setClientBirthDate(String clientBirthDate) {
		this.clientBirthDate = clientBirthDate;
	}

	public String getClientSex() {
		return this.clientSex;
	}

	public void setClientSex(String clientSex) {
		this.clientSex = clientSex;
	}

	public String getClientLogin() {
		return this.clientLogin;
	}

	public void setClientLogin(String clientLogin) {
		this.clientLogin = clientLogin;
	}

	public String getClientPassword() {
		return this.clientPassword;
	}

	public void setClientPassword(String clientPassword) {
		this.clientPassword = clientPassword;
	}

	public SubscribedClient(String clientName, String clientLastName,
			String clientEmail, String clientBirthDate, String clientSex,
			String clientLogin, String clientPassword) {
		super();
		this.clientName = clientName;
		this.clientLastName = clientLastName;
		this.clientEmail = clientEmail;
		this.clientBirthDate = clientBirthDate;
		this.clientSex = clientSex;
		this.clientLogin = clientLogin;
		this.clientPassword = clientPassword;
	}

	
@ManyToMany
public java.util.List<Gallery> getGallery() {
	return gallery;
}

public void setGallery(java.util.List<Gallery> gallery) {
	this.gallery = gallery;
}


@ManyToMany
public java.util.List<Actuality> getActuality() {
	return actuality;
}

public void setActuality(java.util.List<Actuality> actuality) {
	this.actuality = actuality;
}


@ManyToMany
public java.util.List<Match> getMatch() {
	return match;
}

public void setMatch(java.util.List<Match> match) {
	this.match = match;
}


@ManyToMany
public java.util.List<Product> getProduct() {
	return product;
}

public void setProduct(java.util.List<Product> product) {
	this.product = product;
}


@ManyToMany
public java.util.List<Team> getTeam() {
	return team;
}

public void setTeam(java.util.List<Team> team) {
	this.team = team;
}


@OneToMany
public java.util.List<MicroEvent> getMicroEvent() {
	return microEvent;
}

public void setMicroEvent(java.util.List<MicroEvent> microEvent) {
	this.microEvent = microEvent;
}

}
