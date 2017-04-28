package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * FrequenceEmail generated by hbm2java
 */
@Entity
@Table(name="frequence_email"
    ,catalog="projet3"
)
public class FrequenceEmail  implements java.io.Serializable {


     private int id;
     private String libelle;
     private Set preferences = new HashSet(0);

    public FrequenceEmail() {
    }

	
    public FrequenceEmail(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    public FrequenceEmail(int id, String libelle, Set preferences) {
       this.id = id;
       this.libelle = libelle;
       this.preferences = preferences;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="LIBELLE", nullable=false, length=20)
    public String getLibelle() {
        return this.libelle;
    }
    
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="frequenceEmail")
    public Set getPreferences() {
        return this.preferences;
    }
    
    public void setPreferences(Set preferences) {
        this.preferences = preferences;
    }




}

