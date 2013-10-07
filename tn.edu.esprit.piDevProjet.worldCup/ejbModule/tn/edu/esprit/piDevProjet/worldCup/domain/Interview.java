package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Interview
 *
 */
@Entity

public class Interview extends Actuality implements Serializable {
	private String interviewdPlayer;
	

	
	public Interview(String interviewdPlayer) {
		super();
		this.interviewdPlayer = interviewdPlayer;
	}

	public String getInterviewdPlayer() {
		return interviewdPlayer;
	}

	public void setInterviewdPlayer(String interviewdPlayer) {
		this.interviewdPlayer = interviewdPlayer;
	}

	private static final long serialVersionUID = 1L;

	public Interview() {
		super();
	}
   
}
