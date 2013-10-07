package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: CollectionAgent
 * 
 */
@Entity
public class CollectionAgent implements Serializable {

	private String login;
	private String password;
	private static final long serialVersionUID = 1L;
private List<MicroEvent> microEvents;
	public CollectionAgent() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
@OneToMany
public List<MicroEvent> getMicroEvents() {
	return microEvents;
}

public void setMicroEvents(List<MicroEvent> microEvents) {
	this.microEvents = microEvents;
}
}
