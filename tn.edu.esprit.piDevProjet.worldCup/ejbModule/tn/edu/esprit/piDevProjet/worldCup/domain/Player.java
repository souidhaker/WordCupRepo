package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

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
	private List<Player> players;
	private Team team;

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

	@OneToMany
	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	@ManyToOne
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
}
