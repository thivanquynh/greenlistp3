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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Admin generated by hbm2java
 */
@Entity
@Table(name="admin"
    ,catalog="projet3"
)
public class Admin  implements java.io.Serializable {


	private static final long serialVersionUID = 1L;
	
	private int id;
     private String pseudo;
     private String nom;
     private String prenom;
     private String email;
     private Date dateInscription;
     private Date dateDesinscription;
     private String password;
     private Date debutSuspension;
     private Date finSuspenssion;
     private List<Coupon> coupons = new ArrayList<>();
     private List<Ticket> tickets = new ArrayList<>();
     private List<ItemFaq> itemFaqs = new ArrayList<>();

    public Admin() {
    }

	
    public Admin(int id, String pseudo, String nom, String prenom, String email, Date dateInscription, String password) {
        this.id = id;
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateInscription = dateInscription;
        this.password = password;
    }
    public Admin(int id, String pseudo, String nom, String prenom, String email, Date dateInscription, Date dateDesinscription, String password, Date debutSuspension, Date finSuspenssion, List<Coupon> coupons, List<Ticket> tickets, List<ItemFaq> itemFaqs) {
       this.id = id;
       this.pseudo = pseudo;
       this.nom = nom;
       this.prenom = prenom;
       this.email = email;
       this.dateInscription = dateInscription;
       this.dateDesinscription = dateDesinscription;
       this.password = password;
       this.debutSuspension = debutSuspension;
       this.finSuspenssion = finSuspenssion;
       this.coupons = coupons;
       this.tickets = tickets;
       this.itemFaqs = itemFaqs;
    }
   
    @Id 
    @Column(name="ID", unique=true, nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="PSEUDO", nullable=false, length=50, unique=true)
    public String getPseudo() {
        return this.pseudo;
    }
    
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    
    @Column(name="NOM", nullable=false, length=50)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    
    @Column(name="PRENOM", nullable=false, length=50)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    @Column(name="EMAIL", nullable=false, length=100, unique=true)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_INSCRIPTION", nullable=false, length=10)
    public Date getDateInscription() {
        return this.dateInscription;
    }
    
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_DESINSCRIPTION", length=10)
    public Date getDateDesinscription() {
        return this.dateDesinscription;
    }
    
    public void setDateDesinscription(Date dateDesinscription) {
        this.dateDesinscription = dateDesinscription;
    }

    
    @Column(name="PASSWORD", nullable=false, length=10)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DEBUT_SUSPENSION", length=10)
    public Date getDebutSuspension() {
        return this.debutSuspension;
    }
    
    public void setDebutSuspension(Date debutSuspension) {
        this.debutSuspension = debutSuspension;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FIN_SUSPENSSION", length=10)
    public Date getFinSuspenssion() {
        return this.finSuspenssion;
    }
    
    public void setFinSuspenssion(Date finSuspenssion) {
        this.finSuspenssion = finSuspenssion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="admin")
    public List<Coupon> getCoupons() {
        return this.coupons;
    }
    
    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="admin")
    public List<Ticket> getTickets() {
        return this.tickets;
    }
    
    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="admin")
    public List<ItemFaq> getItemFaqs() {
        return this.itemFaqs;
    }
    
    public void setItemFaqs(List<ItemFaq> itemFaqs) {
        this.itemFaqs = itemFaqs;
    }




}


