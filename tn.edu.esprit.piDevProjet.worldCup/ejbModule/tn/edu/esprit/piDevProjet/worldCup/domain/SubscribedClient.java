package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: SubscribedClient
 *
 */
@Entity

public class SubscribedClient implements Serializable {
	private int id;

	
	private static final long serialVersionUID = 1L;

	public SubscribedClient() {
		super();
	}
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
   
}
