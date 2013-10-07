package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChiefEditor
 *
 */
@Entity

public class ChiefEditor implements Serializable {

	   
	
	private String login;
	private String password;
	private static final long serialVersionUID = 1L;
private List<Actuality> actualities;
	public ChiefEditor() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public ChiefEditor(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
   @OneToMany
   public List<Actuality> getActualities() {
		return actualities;
	}
	public void setActualities(List<Actuality> actualities) {
		this.actualities = actualities;
	}
	
}
