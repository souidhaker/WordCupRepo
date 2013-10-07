package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

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
private List<Ads> ads;
private List<Product> product;
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

	
	
	@OneToMany
	public List<Ads> getAds() {
		return ads;
	}

	public void setAds(List<Ads> ads) {
		this.ads = ads;
	}

	
   @OneToMany
   public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
}
