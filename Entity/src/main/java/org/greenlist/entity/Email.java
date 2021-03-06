package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Email generated by hbm2java
 */
@Entity
@Table(name="email"
    ,catalog="projet3"
)
public class Email  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
     private TypeEmail typeEmail;
     private Utilisateur utilisateur;
     private String contenu;
     private String objet;
     private Date dateEmission;

    public Email() {
    }

    public Email(int id, TypeEmail typeEmail, Utilisateur utilisateur, String contenu, String objet, Date dateEmission) {
       this.id = id;
       this.typeEmail = typeEmail;
       this.utilisateur = utilisateur;
       this.contenu = contenu;
       this.objet = objet;
       this.dateEmission = dateEmission;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDTYPE", nullable=false)
    public TypeEmail getTypeEmail() {
        return this.typeEmail;
    }
    
    public void setTypeEmail(TypeEmail typeEmail) {
        this.typeEmail = typeEmail;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDUTILISATEUR", nullable=false)
    public Utilisateur getUtilisateur() {
        return this.utilisateur;
    }
    
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    
    @Column(name="CONTENU", nullable=false, length=65535)
    public String getContenu() {
        return this.contenu;
    }
    
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    
    @Column(name="OBJET", nullable=false, length=250)
    public String getObjet() {
        return this.objet;
    }
    
    public void setObjet(String objet) {
        this.objet = objet;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="DATE_EMISSION", nullable=false, length=19)
    public Date getDateEmission() {
        return this.dateEmission;
    }
    
    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }




}


