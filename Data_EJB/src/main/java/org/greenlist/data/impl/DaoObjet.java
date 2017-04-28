package org.greenlist.data.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.greenlist.data.api.IDaoObjet;
import org.greenlist.entity.Domaine;
import org.greenlist.entity.Groupe;
import org.greenlist.entity.Objet;
import org.greenlist.entity.Produit;
import org.greenlist.entity.Utilisateur;

@Remote(IDaoObjet.class)
@Singleton
public class DaoObjet implements IDaoObjet {
	
	@PersistenceContext(unitName = "DATA_EJB")
	private EntityManager em;
	
	private static final String REQUETTE_GET_OBJET_BY_ID = "SELECT o FROM Objet as o WHERE o.id = :pidObjet";
	
	private static final String REQUETTE_GET_OBJETS_BY_UTILISATEUR = "SELECT o FROM Objet as o WHERE o.utilisateur = :pUtilisateur";
	
	private static final String REQUETTE_GET_OBJETS_BY_LIBELLE = "SELECT o FROM Objet as o WHERE o.libelle LIKE :pmotClef";
	
	private static final String REQUETTE_GET_OBJETS_BY_DOMAINE = " SELECT o FROM Objet  as o"
																	+" JOIN o.produit as produit"
																		+" join produit.groupe as groupe"
																			+"joint groupe.domaine as domaine"
																			+" WHERE domaine = :pDomaine";
																				
	private static final String REQUETTE_GET_OBJETS_BY_GROUPE = " SELECT o FROM Objet as  o"
																	+" JOIN o.produit as produit "
																		+"join produit.groupe as groupe"
																		+" WHERE groupe = :pGroupe";
																				
	private static final String REQUETTE_GET_OBJETS_BY_PRODUIT = "SELECT o FROM objet as o"
																	+"Join o.produit as produit"
																	+" WHERE produit = :Produit";
/**
 * Methode pour récupérer un objet par son id
 * @param idObjet id de l'objet recherché
 */
	@Override
	public Objet getObjetById(int idObjet) {
		Query query = em.createQuery(REQUETTE_GET_OBJET_BY_ID).setParameter("pidObjet", idObjet);
		return (Objet) query.getSingleResult();
	}
	
	/**
	 * Methode pour ajouter un objet
	 * @param objet Objet à créer
	 */
	@Override
	public Objet createObjet(Objet objet) {	
		em.getTransaction().begin();
		em.persist(objet);
		em.getTransaction().commit();
		em.close();
		return objet;
	}
	
	/**
	 * Methode pour récupérer l'ensemble des objets d'un utilisateur
	 * @param utilisateur le propriétaire des objets recherchés
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Objet> getObjetsByUtilisateur(Utilisateur utilisateur) {
		Query query = em.createQuery(REQUETTE_GET_OBJETS_BY_UTILISATEUR).setParameter("pUtilisateur", utilisateur);
		return query.getResultList();
	}
/**
 * Methode pour rechercher les objets aillant un libellé ressemblant à une chaine de caractere
 * @param motClef Chaine que l'on cherche 
 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Objet> getObjetsByLibelle(String motClef) {
		
		StringBuilder sb = new StringBuilder();
				motClef = sb.append("%").append(motClef).append("%").toString();
		
		Query query = em.createQuery(REQUETTE_GET_OBJETS_BY_LIBELLE).setParameter("pmotClef", motClef);
		return query.getResultList();
		
	}
	
/**
 * Recherche des objets appartenant à un domaine
 * @param domaine le domaine que l'on recherche
 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Objet> getObjetsByDomaine(Domaine domaine) {
		Query query = em.createQuery(REQUETTE_GET_OBJETS_BY_LIBELLE).setParameter("pDomaine", domaine);
		return query.getResultList();
	}

	/**
	 * Recherche des objets appartenant à un groupe
	 * @param domaine le groupe que l'on recherche
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Objet> getObjetsByGroupe(Groupe groupe) {
		Query query = em.createQuery(REQUETTE_GET_OBJETS_BY_LIBELLE).setParameter("pGroupe", groupe);
		return query.getResultList();
	}

	/**
	 * Recherche des objets appartenant à un produit
	 * @param domaine le produit que l'on recherche
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Objet> getObjetsByProduit(Produit produit) {
		Query query = em.createQuery(REQUETTE_GET_OBJETS_BY_LIBELLE).setParameter("pProduit", produit);
		return query.getResultList();
	}

	

}
