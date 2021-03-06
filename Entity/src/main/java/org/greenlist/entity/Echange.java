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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Echange generated by hbm2java
 */
@Entity
@Table(name = "echange", catalog = "projet3")
public class Echange implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private Conclusionechange conclusionechange;
	private Echange echange;
	private MotifRefus motifRefus;
	private Utilisateur utilisateurByIdusera;
	private Utilisateur utilisateurByIduserb;
	private Date dateCreation;
	private Date dateDebutNegociation;
	private Date dateValidationNegociation;
	private Date dateEchange;
	private boolean hasvalidatedusera;
	private boolean hasvalidateduserb;
	private Date dateConclusion;
	private List<Rdv> rdvs = new ArrayList<>();
	private List<Object> objets = new ArrayList<>();
	private List<Echange> echanges = new ArrayList<>();
	private List<Note> notes = new ArrayList<>();
	private List<Message> messages = new ArrayList<>();

	public Echange() {
	}

	public Echange(int id, Utilisateur utilisateurByIdusera, Utilisateur utilisateurByIduserb, Date dateCreation,
			boolean hasvalidatedusera, boolean hasvalidateduserb, Date dateConclusion) {
		this.id = id;
		this.utilisateurByIdusera = utilisateurByIdusera;
		this.utilisateurByIduserb = utilisateurByIduserb;
		this.dateCreation = dateCreation;
		this.hasvalidatedusera = hasvalidatedusera;
		this.hasvalidateduserb = hasvalidateduserb;
		this.dateConclusion = dateConclusion;
	}

	public Echange(int id, Conclusionechange conclusionechange, Echange echange, MotifRefus motifRefus,
			Utilisateur utilisateurByIdusera, Utilisateur utilisateurByIduserb, Date dateCreation,
			Date dateDebutNegociation, Date dateValidationNegociation, Date dateEchange, boolean hasvalidatedusera,
			boolean hasvalidateduserb, Date dateConclusion, List<Rdv> rdvs, List<Object> objets, List<Echange> echanges,
			List<Note> notes, List<Message> messages) {
		this.id = id;
		this.conclusionechange = conclusionechange;
		this.echange = echange;
		this.motifRefus = motifRefus;
		this.utilisateurByIdusera = utilisateurByIdusera;
		this.utilisateurByIduserb = utilisateurByIduserb;
		this.dateCreation = dateCreation;
		this.dateDebutNegociation = dateDebutNegociation;
		this.dateValidationNegociation = dateValidationNegociation;
		this.dateEchange = dateEchange;
		this.hasvalidatedusera = hasvalidatedusera;
		this.hasvalidateduserb = hasvalidateduserb;
		this.dateConclusion = dateConclusion;
		this.rdvs = rdvs;
		this.objets = objets;
		this.echanges = echanges;
		this.notes = notes;
		this.messages = messages;
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
	@JoinColumn(name = "IDCONCLUSION")
	public Conclusionechange getConclusionechange() {
		return this.conclusionechange;
	}

	public void setConclusionechange(Conclusionechange conclusionechange) {
		this.conclusionechange = conclusionechange;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDECHANGEPARENT")
	public Echange getEchange() {
		return this.echange;
	}

	public void setEchange(Echange echange) {
		this.echange = echange;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDMOTIFREFUS")
	public MotifRefus getMotifRefus() {
		return this.motifRefus;
	}

	public void setMotifRefus(MotifRefus motifRefus) {
		this.motifRefus = motifRefus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUSERA", nullable = false)
	public Utilisateur getUtilisateurByIdusera() {
		return this.utilisateurByIdusera;
	}

	public void setUtilisateurByIdusera(Utilisateur utilisateurByIdusera) {
		this.utilisateurByIdusera = utilisateurByIdusera;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDUSERB", nullable = false)
	public Utilisateur getUtilisateurByIduserb() {
		return this.utilisateurByIduserb;
	}

	public void setUtilisateurByIduserb(Utilisateur utilisateurByIduserb) {
		this.utilisateurByIduserb = utilisateurByIduserb;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_CREATION", nullable = false, length = 19)
	public Date getDateCreation() {
		return this.dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_DEBUT_NEGOCIATION", length = 19)
	public Date getDateDebutNegociation() {
		return this.dateDebutNegociation;
	}

	public void setDateDebutNegociation(Date dateDebutNegociation) {
		this.dateDebutNegociation = dateDebutNegociation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_VALIDATION_NEGOCIATION", length = 19)
	public Date getDateValidationNegociation() {
		return this.dateValidationNegociation;
	}

	public void setDateValidationNegociation(Date dateValidationNegociation) {
		this.dateValidationNegociation = dateValidationNegociation;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_ECHANGE", length = 19)
	public Date getDateEchange() {
		return this.dateEchange;
	}

	public void setDateEchange(Date dateEchange) {
		this.dateEchange = dateEchange;
	}

	@Column(name = "HASVALIDATEDUSERA", nullable = false)
	public boolean isHasvalidatedusera() {
		return this.hasvalidatedusera;
	}

	public void setHasvalidatedusera(boolean hasvalidatedusera) {
		this.hasvalidatedusera = hasvalidatedusera;
	}

	@Column(name = "HASVALIDATEDUSERB", nullable = false)
	public boolean isHasvalidateduserb() {
		return this.hasvalidateduserb;
	}

	public void setHasvalidateduserb(boolean hasvalidateduserb) {
		this.hasvalidateduserb = hasvalidateduserb;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_CONCLUSION", nullable = false, length = 10)
	public Date getDateConclusion() {
		return this.dateConclusion;
	}

	public void setDateConclusion(Date dateConclusion) {
		this.dateConclusion = dateConclusion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "echange")
	public List<Rdv> getRdvs() {
		return this.rdvs;
	}

	public void setRdvs(List<Rdv> rdvs) {
		this.rdvs = rdvs;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "echanges")
	public List<Object> getObjets() {
		return this.objets;
	}

	public void setObjets(List<Object> objets) {
		this.objets = objets;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "echange")
	public List<Echange> getEchanges() {
		return this.echanges;
	}

	public void setEchanges(List<Echange> echanges) {
		this.echanges = echanges;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "echange")
	public List<Note> getNotes() {
		return this.notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "echange")
	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

}
