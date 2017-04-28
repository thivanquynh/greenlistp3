package org.greenlist.entity�;
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
 * Experience generated by hbm2java
 */
@Entity
@Table(name="experience"
    ,catalog="projet3"
)
public class Experience  implements java.io.Serializable {


     private int id;
     private String experience;
     private Set utilisateurs = new HashSet(0);

    public Experience() {
    }

	
    public Experience(int id, String experience) {
        this.id = id;
        this.experience = experience;
    }
    public Experience(int id, String experience, Set utilisateurs) {
       this.id = id;
       this.experience = experience;
       this.utilisateurs = utilisateurs;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="EXPERIENCE", nullable=false, length=100)
    public String getExperience() {
        return this.experience;
    }
    
    public void setExperience(String experience) {
        this.experience = experience;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="experience")
    public Set getUtilisateurs() {
        return this.utilisateurs;
    }
    
    public void setUtilisateurs(Set utilisateurs) {
        this.utilisateurs = utilisateurs;
    }




}


