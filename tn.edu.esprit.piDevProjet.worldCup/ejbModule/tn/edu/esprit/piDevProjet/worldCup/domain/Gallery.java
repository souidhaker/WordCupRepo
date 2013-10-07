package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Gallery
 *
 */
@Entity

public class Gallery implements Serializable {
	private int galleryId;
	private String galleryName;
	private String galleryDescription;
	

	
	public Gallery(int galleryId, String galleryName, String galleryDescription) {
		super();
		this.galleryId = galleryId;
		this.galleryName = galleryName;
		this.galleryDescription = galleryDescription;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getGalleryId() {
		return galleryId;
	}

	public void setGalleryId(int galleryId) {
		this.galleryId = galleryId;
	}

	public String getGalleryName() {
		return galleryName;
	}

	public void setGalleryName(String galleryName) {
		this.galleryName = galleryName;
	}

	public String getGalleryDescription() {
		return galleryDescription;
	}

	public void setGalleryDescription(String galleryDescription) {
		this.galleryDescription = galleryDescription;
	}


	private static final long serialVersionUID = 1L;

	public Gallery() {
		super();
	}
   
}
