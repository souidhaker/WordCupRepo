package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity

public class Player implements Serializable {

	
	private int playerId;
	private String playerName;
	private String playerLastName;
	private Date playerDateBirth;
	private boolean playerState;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}   
	public String getPlayerName() {
		return this.playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}   
	public String getPlayerLastName() {
		return this.playerLastName;
	}

	public void setPlayerLastName(String playerLastName) {
		this.playerLastName = playerLastName;
	}   
	public Date getPlayerDateBirth() {
		return this.playerDateBirth;
	}

	public void setPlayerDateBirth(Date playerDateBirth) {
		this.playerDateBirth = playerDateBirth;
	}   
	public boolean getPlayerState() {
		return this.playerState;
	}

	public void setPlayerState(boolean playerState) {
		this.playerState = playerState;
	}
	public Player(int playerId, String playerName, String playerLastName,
			Date playerDateBirth, boolean playerState) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerLastName = playerLastName;
		this.playerDateBirth = playerDateBirth;
		this.playerState = playerState;
	}
   
}
