package org.greenlist.entity;
// Generated 28 avr. 2017 10:03:43 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name="utilisateur"
    ,catalog="projet3"
)
public class Utilisateur  implements java.io.Serializable {


     private int id;
     private Experience experience;
     private MotifRadiation motifRadiation;
     private Panier panier;
     private Preference preference;
     private String pseudo;
     private String nom;
     private String prenom;
     private String email;
     private Date dateNaissance;
     private Date dateInscription;
     private String photo;
     private int solde;
     private Date debutSuspension;
     private Date finSuspension;
     private String password;
     private Date dateDesinscription;
     private Date dateRadiation;
     private Date dateDerniereConnexion;
     private List<Ticket> ticketsForIdutilisateurremonte = new ArrayList<>();
     private List<Preference> preferences = new ArrayList<>();
     private List<Liste> listes = new ArrayList<>();
     private List<Adresse> adresses = new ArrayList<>();
     private List<Message> messages = new ArrayList<>();
     private List<Echange> echangesForIdusera = new ArrayList<>();
     private List<Echange> echangesForIduserb = new ArrayList<>();
     private List<Objet> objets = new ArrayList<>();
     private List<Ticket> ticketsForIdutilisateursignale = new ArrayList<>();
     private List<Coupon> coupons = new ArrayList<>();
     private List<Note> notesForIdutilisateurnote = new ArrayList<>();
     private List<Email> emails = new ArrayList<>();
     private List<Notification> notifications = new ArrayList<>();
     private List<Note> notesForIdutilisateurestnote = new ArrayList<>();
     private List<Messagepublic> messagepublics = new ArrayList<>();
     private List<Panier> paniers = new ArrayList<>();

    public Utilisateur() {
    }

	
    public Utilisateur(int id, Experience experience, Panier panier, Preference preference, String pseudo, String nom, String prenom, String email, Date dateNaissance, Date dateInscription, int solde, String password) {
        this.id = id;
        this.experience = experience;
        this.panier = panier;
        this.preference = preference;
        this.pseudo = pseudo;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.dateInscription = dateInscription;
        this.solde = solde;
        this.password = password;
    }
    public Utilisateur(int id, Experience experience, MotifRadiation motifRadiation, Panier panier, Preference preference, String pseudo, String nom, String prenom, String email, Date dateNaissance, Date dateInscription, String photo, int solde, Date debutSuspension, Date finSuspension, String password, Date dateDesinscription, Date dateRadiation, Date dateDerniereConnexion, List<Ticket> ticketsForIdutilisateurremonte, List<Preference> preferences, List<Liste> listes, List<Adresse> adresses, List<Message> messages, List<Echange> echangesForIdusera, List<Echange> echangesForIduserb, List<Objet> objets, List<Ticket> ticketsForIdutilisateursignale, List<Coupon> coupons, List<Note> notesForIdutilisateurnote, List<Email> emails, List<Notification> notifications, List<Note> notesForIdutilisateurestnote, List<Messagepublic> messagepublics, List<Panier> paniers) {
       this.id = id;
       this.experience = experience;
       this.motifRadiation = motifRadiation;
       this.panier = panier;
       this.preference = preference;
       this.pseudo = pseudo;
       this.nom = nom;
       this.prenom = prenom;
       this.email = email;
       this.dateNaissance = dateNaissance;
       this.dateInscription = dateInscription;
       this.photo = photo;
       this.solde = solde;
       this.debutSuspension = debutSuspension;
       this.finSuspension = finSuspension;
       this.password = password;
       this.dateDesinscription = dateDesinscription;
       this.dateRadiation = dateRadiation;
       this.dateDerniereConnexion = dateDerniereConnexion;
       this.ticketsForIdutilisateurremonte = ticketsForIdutilisateurremonte;
       this.preferences = preferences;
       this.listes = listes;
       this.adresses = adresses;
       this.messages = messages;
       this.echangesForIdusera = echangesForIdusera;
       this.echangesForIduserb = echangesForIduserb;
       this.objets = objets;
       this.ticketsForIdutilisateursignale = ticketsForIdutilisateursignale;
       this.coupons = coupons;
       this.notesForIdutilisateurnote = notesForIdutilisateurnote;
       this.emails = emails;
       this.notifications = notifications;
       this.notesForIdutilisateurestnote = notesForIdutilisateurestnote;
       this.messagepublics = messagepublics;
       this.paniers = paniers;
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
    @JoinColumn(name="IDXP", nullable=false)
    public Experience getExperience() {
        return this.experience;
    }
    
    public void setExperience(Experience experience) {
        this.experience = experience;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDMOTIF")
    public MotifRadiation getMotifRadiation() {
        return this.motifRadiation;
    }
    
    public void setMotifRadiation(MotifRadiation motifRadiation) {
        this.motifRadiation = motifRadiation;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDPANIER", nullable=false)
    public Panier getPanier() {
        return this.panier;
    }
    
    public void setPanier(Panier panier) {
        this.panier = panier;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDPREFERENCE", nullable=false)
    public Preference getPreference() {
        return this.preference;
    }
    
    public void setPreference(Preference preference) {
        this.preference = preference;
    }

    
    @Column(name="PSEUDO", nullable=false, length=50)
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

    
    @Column(name="EMAIL", nullable=false, length=50)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_NAISSANCE", nullable=false, length=10)
    public Date getDateNaissance() {
        return this.dateNaissance;
    }
    
    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_INSCRIPTION", nullable=false, length=10)
    public Date getDateInscription() {
        return this.dateInscription;
    }
    
    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    
    @Column(name="PHOTO", length=200)
    public String getPhoto() {
        return this.photo;
    }
    
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    
    @Column(name="SOLDE", nullable=false)
    public int getSolde() {
        return this.solde;
    }
    
    public void setSolde(int solde) {
        this.solde = solde;
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
    @Column(name="FIN_SUSPENSION", length=10)
    public Date getFinSuspension() {
        return this.finSuspension;
    }
    
    public void setFinSuspension(Date finSuspension) {
        this.finSuspension = finSuspension;
    }

    
    @Column(name="PASSWORD", nullable=false, length=50)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_DESINSCRIPTION", length=10)
    public Date getDateDesinscription() {
        return this.dateDesinscription;
    }
    
    public void setDateDesinscription(Date dateDesinscription) {
        this.dateDesinscription = dateDesinscription;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_RADIATION", length=10)
    public Date getDateRadiation() {
        return this.dateRadiation;
    }
    
    public void setDateRadiation(Date dateRadiation) {
        this.dateRadiation = dateRadiation;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_DERNIERE_CONNEXION", length=10)
    public Date getDateDerniereConnexion() {
        return this.dateDerniereConnexion;
    }
    
    public void setDateDerniereConnexion(Date dateDerniereConnexion) {
        this.dateDerniereConnexion = dateDerniereConnexion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateurByIdutilisateurremonte")
    public List<Ticket> getTicketsForIdutilisateurremonte() {
        return this.ticketsForIdutilisateurremonte;
    }
    
    public void setTicketsForIdutilisateurremonte(List<Ticket> ticketsForIdutilisateurremonte) {
        this.ticketsForIdutilisateurremonte = ticketsForIdutilisateurremonte;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Preference> getPreferences() {
        return this.preferences;
    }
    
    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Liste> getListes() {
        return this.listes;
    }
    
    public void setListes(List<Liste> listes) {
        this.listes = listes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Adresse> getAdresses() {
        return this.adresses;
    }
    
    public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Message> getMessages() {
        return this.messages;
    }
    
    public void setMessages(List<Message> messages) {
        this.messages =  messages;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateurByIdusera")
    public List<Echange> getEchangesForIdusera() {
        return this.echangesForIdusera;
    }
    
    public void setEchangesForIdusera(List<Echange> echangesForIdusera) {
        this.echangesForIdusera = echangesForIdusera;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateurByIduserb")
    public List<Echange> getEchangesForIduserb() {
        return this.echangesForIduserb;
    }
    
    public void setEchangesForIduserb(List<Echange> echangesForIduserb) {
        this.echangesForIduserb = echangesForIduserb;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Objet> getObjets() {
        return this.objets;
    }
    
    public void setObjets(List<Objet> objets) {
        this.objets = objets;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateurByIdutilisateursignale")
    public List<Ticket> getTicketsForIdutilisateursignale() {
        return this.ticketsForIdutilisateursignale;
    }
    
    public void setTicketsForIdutilisateursignale(List<Ticket> ticketsForIdutilisateursignale) {
        this.ticketsForIdutilisateursignale = ticketsForIdutilisateursignale;
    }

@ManyToMany(fetch=FetchType.LAZY, mappedBy="utilisateurs")
    public List<Coupon> getCoupons() {
        return this.coupons;
    }
    
    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateurByIdutilisateurnote")
    public List<Note> getNotesForIdutilisateurnote() {
        return this.notesForIdutilisateurnote;
    }
    
    public void setNotesForIdutilisateurnote(List<Note> notesForIdutilisateurnote) {
        this.notesForIdutilisateurnote = notesForIdutilisateurnote;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Email> getEmails() {
        return this.emails;
    }
    
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Notification> getNotifications() {
        return this.notifications;
    }
    
    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateurByIdutilisateurestnote")
    public List<Note> getNotesForIdutilisateurestnote() {
        return this.notesForIdutilisateurestnote;
    }
    
    public void setNotesForIdutilisateurestnote(List<Note> notesForIdutilisateurestnote) {
        this.notesForIdutilisateurestnote = notesForIdutilisateurestnote;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Messagepublic> getMessagepublics() {
        return this.messagepublics;
    }
    
    public void setMessagepublics(List<Messagepublic> messagepublics) {
        this.messagepublics = messagepublics;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateur")
    public List<Panier> getPaniers() {
        return this.paniers;
    }
    
    public void setPaniers(List<Panier> paniers) {
        this.paniers = paniers;
    }




}


