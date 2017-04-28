package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TrancheAge generated by hbm2java
 */
@Entity
@Table(name = "tranche_age", catalog = "projet3")
public class TrancheAge implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String libelle;
	private List<Objet> objets = new ArrayList<>();
	private List<Souhait> souhaits = new ArrayList<>();

	public TrancheAge() {
	}

	public TrancheAge(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public TrancheAge(int id, String libelle, List<Objet> objets, List<Souhait> souhaits) {
		this.id = id;
		this.libelle = libelle;
		this.objets = objets;
		this.souhaits = souhaits;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "LIBELLE", nullable = false, length = 50)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trancheAge")
	public List<Objet> getObjets() {
		return this.objets;
	}

	public void setObjets(List<Objet> objets) {
		this.objets = objets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trancheAge")
	public List<Souhait> getSouhaits() {
		return this.souhaits;
	}

	public void setSouhaits(List<Souhait> souhaits) {
		this.souhaits = souhaits;
	}

}
