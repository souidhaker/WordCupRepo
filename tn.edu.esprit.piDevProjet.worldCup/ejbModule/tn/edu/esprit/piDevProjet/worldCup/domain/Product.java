package tn.edu.esprit.piDevProjet.worldCup.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Product
 *
 */
@Entity

public class Product implements Serializable {

	   
	
	private int idProduct;
	private String productLabel;
	private String productCategory;
	private static final long serialVersionUID = 1L;

	public Product() {
		super();
	}   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdProduct() {
		return this.idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}   
	public String getProductLabel() {
		return this.productLabel;
	}

	public void setProductLabel(String productLabel) {
		this.productLabel = productLabel;
	}   
	public String getProductCategory() {
		return this.productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public Product(int idProduct, String productLabel, String productCategory) {
		super();
		this.idProduct = idProduct;
		this.productLabel = productLabel;
		this.productCategory = productCategory;
	}
	
	
	
	
   
}
