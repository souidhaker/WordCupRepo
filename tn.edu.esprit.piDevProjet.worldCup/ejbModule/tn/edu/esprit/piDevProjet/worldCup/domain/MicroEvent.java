package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MicroEvent
 *
 */
@Entity

public class MicroEvent implements Serializable {

	private int idEvent;
	private String nameEvent;
	private int timeEvent;
	private String typeEvent;
	private SubscribedClient  subscribedClient;
	private static final long serialVersionUID = 1L;
	private MicroEvent microEvent;
	private Player player;
	private Team team;
	public MicroEvent() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getNameEvent() {
		return nameEvent;
	}

	public void setNameEvent(String nameEvent) {
		this.nameEvent = nameEvent;
	}

	public int getTimeEvent() {
		return timeEvent;
	}

	public void setTimeEvent(int timeEvent) {
		this.timeEvent = timeEvent;
	}

	public String getTypeEvent() {
		return typeEvent;
	}

	public void setTypeEvent(String typeEvent) {
		this.typeEvent = typeEvent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public MicroEvent(int idEvent, String nameEvent, int timeEvent,
			String typeEvent) {
		super();
		this.idEvent = idEvent;
		this.nameEvent = nameEvent;
		this.timeEvent = timeEvent;
		this.typeEvent = typeEvent;
	}

	
   @ManyToOne
   public SubscribedClient getSubscribedClient() {
		return subscribedClient;
	}

	public void setSubscribedClient(SubscribedClient subscribedClient) {
		this.subscribedClient = subscribedClient;
	}

	
	@ManyToOne
	public MicroEvent getMicroEvent() {
		return microEvent;
	}

	public void setMicroEvent(MicroEvent microEvent) {
		this.microEvent = microEvent;
	}

	
	@ManyToOne
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	
	@ManyToOne
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
}
