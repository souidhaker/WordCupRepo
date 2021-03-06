package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Team
 *
 */
@Entity

public class Team implements Serializable {

	
	private int idTeam;
	private String teamName;
	private String teamCoach;
	private int teamLoss;
	private int teamVectories;
	private char teamGroupp;
	private static final long serialVersionUID = 1L;
private List<SubscribedClient> subscribedClient;
private List<MicroEvent> microEvents;
private List<Player> players;
	public Team() {
		super();
	}   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdTeam() {
		return this.idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}   
	public String getTeamName() {
		return this.teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}   
	public String getTeamCoach() {
		return this.teamCoach;
	}

	public void setTeamCoach(String teamCoach) {
		this.teamCoach = teamCoach;
	}   
	public int getTeamLoss() {
		return this.teamLoss;
	}

	public void setTeamLoss(int teamLoss) {
		this.teamLoss = teamLoss;
	}   
	public int getTeamVectories() {
		return this.teamVectories;
	}

	public void setTeamVectories(int teamVectories) {
		this.teamVectories = teamVectories;
	}   
	public char getTeamGroupp() {
		return this.teamGroupp;
	}

	public void setTeamGroupp(char teamGroupp) {
		this.teamGroupp = teamGroupp;
	}
	public Team(int idTeam, String teamName, String teamCoach, int teamLoss,
			int teamVectories, char teamGroupp) {
		super();
		this.idTeam = idTeam;
		this.teamName = teamName;
		this.teamCoach = teamCoach;
		this.teamLoss = teamLoss;
		this.teamVectories = teamVectories;
		this.teamGroupp = teamGroupp;
	}
	
   @ManyToMany
   public List<SubscribedClient> getSubscribedClient() {
		return subscribedClient;
	}
	public void setSubscribedClient(List<SubscribedClient> subscribedClient) {
		this.subscribedClient = subscribedClient;
	}
	
	@OneToMany
	public List<MicroEvent> getMicroEvents() {
		return microEvents;
	}
	public void setMicroEvents(List<MicroEvent> microEvents) {
		this.microEvents = microEvents;
	}
	
	@OneToMany
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	} 
}
