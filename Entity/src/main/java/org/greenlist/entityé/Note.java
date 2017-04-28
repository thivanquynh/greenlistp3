package org.greenlist.entity�;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Note generated by hbm2java
 */
@Entity
@Table(name="note"
    ,catalog="projet3"
)
public class Note  implements java.io.Serializable {


     private int id;
     private Echange echange;
     private Utilisateur utilisateurByIdutilisateurnote;
     private Utilisateur utilisateurByIdutilisateurestnote;
     private int note;
     private String appreciation;

    public Note() {
    }

	
    public Note(int id, Echange echange, Utilisateur utilisateurByIdutilisateurnote, Utilisateur utilisateurByIdutilisateurestnote, int note) {
        this.id = id;
        this.echange = echange;
        this.utilisateurByIdutilisateurnote = utilisateurByIdutilisateurnote;
        this.utilisateurByIdutilisateurestnote = utilisateurByIdutilisateurestnote;
        this.note = note;
    }
    public Note(int id, Echange echange, Utilisateur utilisateurByIdutilisateurnote, Utilisateur utilisateurByIdutilisateurestnote, int note, String appreciation) {
       this.id = id;
       this.echange = echange;
       this.utilisateurByIdutilisateurnote = utilisateurByIdutilisateurnote;
       this.utilisateurByIdutilisateurestnote = utilisateurByIdutilisateurestnote;
       this.note = note;
       this.appreciation = appreciation;
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
    @JoinColumn(name="IDECHANGE", nullable=false)
    public Echange getEchange() {
        return this.echange;
    }
    
    public void setEchange(Echange echange) {
        this.echange = echange;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDUTILISATEURNOTE", nullable=false)
    public Utilisateur getUtilisateurByIdutilisateurnote() {
        return this.utilisateurByIdutilisateurnote;
    }
    
    public void setUtilisateurByIdutilisateurnote(Utilisateur utilisateurByIdutilisateurnote) {
        this.utilisateurByIdutilisateurnote = utilisateurByIdutilisateurnote;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDUTILISATEURESTNOTE", nullable=false)
    public Utilisateur getUtilisateurByIdutilisateurestnote() {
        return this.utilisateurByIdutilisateurestnote;
    }
    
    public void setUtilisateurByIdutilisateurestnote(Utilisateur utilisateurByIdutilisateurestnote) {
        this.utilisateurByIdutilisateurestnote = utilisateurByIdutilisateurestnote;
    }

    
    @Column(name="NOTE", nullable=false)
    public int getNote() {
        return this.note;
    }
    
    public void setNote(int note) {
        this.note = note;
    }

    
    @Column(name="APPRECIATION", length=500)
    public String getAppreciation() {
        return this.appreciation;
    }
    
    public void setAppreciation(String appreciation) {
        this.appreciation = appreciation;
    }




}


