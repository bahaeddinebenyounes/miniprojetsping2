package com.baha.vetements.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idType;
	private String nomType;
	private String descriptionType;
	
	
	@OneToMany(mappedBy = "type")
	private List<Vetement> vetements;
	public Type(String nomCat, String descriptionCat, List<Vetement> vetements) {
	super();
	this.nomType = nomCat;
	this.descriptionType = descriptionCat;
	this.vetements = vetements;
	}
	public Long getIdCat() {
	return idType;
	}
	public void setIdCat(Long idType) {
	this.idType = idType;
	}
	public String getNomCat() {
	return nomType;
	}
	public void setNomCat(String nomCat) {
	this.nomType = nomCat;
	}
	public String getDescriptionCat() {
	return descriptionType;
	}
	public void setDescriptionCat(String descriptionType) {
	this.descriptionType = descriptionType;
	}
	public List<Vetement> getProduits() {
	return vetements;
	}
	public void setProduits(List<Vetement> vetements) {
	this.vetements = vetements;
	}
	}
	

