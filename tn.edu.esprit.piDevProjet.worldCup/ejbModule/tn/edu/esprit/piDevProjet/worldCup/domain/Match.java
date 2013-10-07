package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Match
 *
 */
@Entity

public class Match implements Serializable {

	   
	
	private int matchId;
	private String matchReferee;
	private Date matchDate;
	private String matchCategory;
	private String matchStadium;
	private static final long serialVersionUID = 1L;
private List<SubscribedClient> subscribedClient ;
	public Match() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getMatchId() {
		return this.matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}   
	public String getMatchReferee() {
		return this.matchReferee;
	}

	public void setMatchReferee(String matchReferee) {
		this.matchReferee = matchReferee;
	}   
	public Date getMatchDate() {
		return this.matchDate;
	}

	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}   
	public String getMatchCategory() {
		return this.matchCategory;
	}

	public void setMatchCategory(String matchCategory) {
		this.matchCategory = matchCategory;
	}   
	public String getMatchStadium() {
		return this.matchStadium;
	}

	public void setMatchStadium(String matchStadium) {
		this.matchStadium = matchStadium;
	}
	public Match(int matchId, String matchReferee, Date matchDate,
			String matchCategory, String matchStadium) {
		super();
		this.matchId = matchId;
		this.matchReferee = matchReferee;
		this.matchDate = matchDate;
		this.matchCategory = matchCategory;
		this.matchStadium = matchStadium;
	}
	
	@ManyToMany
	public List<SubscribedClient> getSubscribedClient() {
		return subscribedClient;
	}
	public void setSubscribedClient(List<SubscribedClient> subscribedClient) {
		this.subscribedClient = subscribedClient;
	}
   
}
