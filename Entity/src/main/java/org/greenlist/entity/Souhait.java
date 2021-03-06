package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Souhait generated by hbm2java
 */
@Entity
@Table(name = "souhait", catalog = "projet3")
public class Souhait implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Domaine domaine;
	private Groupe groupe;
	private Liste liste;
	private Produit produit;
	private TrancheAge trancheAge;
	private String libelle;
	private Date dateDepot;
	private Date dateExpiration;
	private Integer valeurmax;
	private Date dateSupression;
	private Date datePublication;
	private Date dateDepublication;
	private List<Ticket> tickets = new ArrayList<>();

	public Souhait() {
	}

	public Souhait(int id, Liste liste, String libelle, Date dateDepot) {
		this.id = id;
		this.liste = liste;
		this.libelle = libelle;
		this.dateDepot = dateDepot;
	}

	public Souhait(int id, Domaine domaine, Groupe groupe, Liste liste, Produit produit, TrancheAge trancheAge,
			String libelle, Date dateDepot, Date dateExpiration, Integer valeurmax, Date dateSupression,
			Date datePublication, Date dateDepublication, List<Ticket> tickets) {
		this.id = id;
		this.domaine = domaine;
		this.groupe = groupe;
		this.liste = liste;
		this.produit = produit;
		this.trancheAge = trancheAge;
		this.libelle = libelle;
		this.dateDepot = dateDepot;
		this.dateExpiration = dateExpiration;
		this.valeurmax = valeurmax;
		this.dateSupression = dateSupression;
		this.datePublication = datePublication;
		this.dateDepublication = dateDepublication;
		this.tickets = tickets;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDDOMAINE")
	public Domaine getDomaine() {
		return this.domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDGROUPE")
	public Groupe getGroupe() {
		return this.groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDLISTE", nullable = false)
	public Liste getListe() {
		return this.liste;
	}

	public void setListe(Liste liste) {
		this.liste = liste;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDPRODUIT")
	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDTRANCHEAGE")
	public TrancheAge getTrancheAge() {
		return this.trancheAge;
	}

	public void setTrancheAge(TrancheAge trancheAge) {
		this.trancheAge = trancheAge;
	}

	@Column(name = "LIBELLE", nullable = false, length = 50)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_DEPOT", nullable = false, length = 10)
	public Date getDateDepot() {
		return this.dateDepot;
	}

	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_EXPIRATION", length = 10)
	public Date getDateExpiration() {
		return this.dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	@Column(name = "VALEURMAX")
	public Integer getValeurmax() {
		return this.valeurmax;
	}

	public void setValeurmax(Integer valeurmax) {
		this.valeurmax = valeurmax;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_SUPRESSION", length = 10)
	public Date getDateSupression() {
		return this.dateSupression;
	}

	public void setDateSupression(Date dateSupression) {
		this.dateSupression = dateSupression;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_PUBLICATION", length = 19)
	public Date getDatePublication() {
		return this.datePublication;
	}

	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_DEPUBLICATION", length = 19)
	public Date getDateDepublication() {
		return this.dateDepublication;
	}

	public void setDateDepublication(Date dateDepublication) {
		this.dateDepublication = dateDepublication;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "souhait")
	public List<Ticket> getTickets() {
		return this.tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

}
