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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TypeEmail generated by hbm2java
 */
@Entity
@Table(name = "type_email", catalog = "projet3")
public class TypeEmail implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String libelle;
	private List<Preference> preferences = new ArrayList<>();
	private List<Email> emails = new ArrayList<>();

	public TypeEmail() {
	}

	public TypeEmail(int id, String libelle) {
		this.id = id;
		this.libelle = libelle;
	}

	public TypeEmail(int id, String libelle, List<Preference> preferences, List<Email> emails) {
		this.id = id;
		this.libelle = libelle;
		this.preferences = preferences;
		this.emails = emails;
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

	@Column(name = "LIBELLE", nullable = false, length = 100)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "definit_mail", catalog = "projet3", joinColumns = {
			@JoinColumn(name = "ID", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "IDPREFERENCE", nullable = false, updatable = false) })
	public List<Preference> getPreferences() {
		return this.preferences;
	}

	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typeEmail")
	public List<Email> getEmails() {
		return this.emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

}
