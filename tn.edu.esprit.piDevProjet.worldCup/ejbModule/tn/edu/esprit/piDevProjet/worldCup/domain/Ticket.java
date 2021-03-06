package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Ticket
 * 
 */
@Entity
public class Ticket implements Serializable {

	private int ticketId;
	private char ticketZone;
	private static final long serialVersionUID = 1L;
private Match match;
	public Ticket() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public char getTicketZone() {
		return this.ticketZone;
	}

	public void setTicketZone(char ticketZone) {
		this.ticketZone = ticketZone;
	}

	public Ticket(char ticketZone) {
		super();
		this.ticketZone = ticketZone;
	}

	
@ManyToOne
public Match getMatch() {
	return match;
}

public void setMatch(Match match) {
	this.match = match;
}
}
