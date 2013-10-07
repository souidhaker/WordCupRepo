package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Administrator
 *
 */
@Entity

public class Administrator implements Serializable {

	   
	
	private String login;
	private String password;
	private static final long serialVersionUID = 1L;

	public Administrator() {
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

	public Administrator(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	
   
}
