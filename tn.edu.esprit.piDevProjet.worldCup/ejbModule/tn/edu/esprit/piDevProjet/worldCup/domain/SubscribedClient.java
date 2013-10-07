package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

}
