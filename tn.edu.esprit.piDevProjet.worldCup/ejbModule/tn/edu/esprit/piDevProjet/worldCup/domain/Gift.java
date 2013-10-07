package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Gift
 *
 */
@Entity

public class Gift implements Serializable {

	
	private String giftKind;
	private static final long serialVersionUID = 1L;

	public Gift() {
		super();
	}  
	@Id
	public String getGiftKind() {
		return this.giftKind;
	}

	public void setGiftKind(String giftKind) {
		this.giftKind = giftKind;
	}
	public Gift(String giftKind) {
		super();
		this.giftKind = giftKind;
	}
   
}
