package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Photo
 *
 */
@Entity

public class Photo implements Serializable {

	
	private int photoId;
	private static final long serialVersionUID = 1L;

	public Photo() {
		super();
	}   
	@Id    
	public int getPhotoId() {
		return this.photoId;
	}

	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}
   
}
