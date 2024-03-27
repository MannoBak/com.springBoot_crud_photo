package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nom_produit")
	private Double nomProduit;
	
	@Column(name = "prix")
	private String prix;
	
	@Column(nullable = true, length = 64)
	private String photos;
	
	@Transient
	public String getPhotosImagePath() {
		if (photos ==null) 
			return null;
		return "product-photos/" + id + "/" + photos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Double getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(Double nomProduit) {
		this.nomProduit = nomProduit;
	}

	public String getPrix() {
		return prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}
	
	
	

}
