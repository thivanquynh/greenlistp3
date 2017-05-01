package org.greenlist.data.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.greenlist.data.api.IDaoSouhait;
import org.greenlist.entity.Domaine;
import org.greenlist.entity.Groupe;
import org.greenlist.entity.Liste;
import org.greenlist.entity.Produit;
import org.greenlist.entity.Souhait;
import org.greenlist.entity.Ticket;
import org.greenlist.entity.TrancheAge;
import org.greenlist.entity.Utilisateur;

/**
 * 
 * @author Stagiaire permet de faire le lien avec la base de donnée
 */
@Remote(IDaoSouhait.class)
@Singleton
public class DaoSouhait implements IDaoSouhait {
	@PersistenceContext(unitName = "Data_EJB")
	private EntityManager em;
	private static final String GET_SOUHAITS_BY_UTLISATEUR = "SELECT u.listes FROM Utilisateur u WHERE u.id = :pIdUtilisateur";
	private static final String GET_SOUHAITS_BY_LISTE = "SELECT l.souhaits FROM Liste l WHERE l.id = :pIdUtilisateur ";
	private static final String GET_LISTE_BY_UTILISATEUR = "SELECT u.listes FROM Utilisateur u WHERE u.id = :pIdUtilisateur";
	private static final String GET_SOUHAIT = "SELECT s FROM Souhait s WHERE s.id = :pIdSouhait";

	/**
	 * renvoi la liste de souhait avec un utilisateur en argument
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Souhait> getSouhaits(Utilisateur utilisateur) throws Exception {
		Query query = em.createQuery(GET_SOUHAITS_BY_UTLISATEUR).setParameter("pidUtilisateur", utilisateur.getId());
		return query.getResultList();
	}

	/**
	 * renvoi une liste de souhait et prend une Liste en argument
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Souhait> getSouhaits(Liste liste) throws Exception {

		Query query = em.createQuery(GET_SOUHAITS_BY_LISTE).setParameter("pidListe", liste.getId());
		return query.getResultList();
	}

	/**
	 * renvoie une liste de souhaits de l'utilisateur
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Liste> getListes(Utilisateur utilisateur) throws Exception {

		Query query = em.createQuery(GET_LISTE_BY_UTILISATEUR).setParameter("pIdUtilisateur", utilisateur.getId());
		return query.getResultList();
	}

	/**
	 * renvoi un souhait
	 */
	@Override
	public Souhait getSouhait(Souhait souhait) throws Exception {

		Query query = em.createQuery(GET_SOUHAIT).setParameter("pIdSouhait", souhait.getId());
		return (Souhait) query.getSingleResult();
	}

	/**
	 * permet d'ajouter un souhait
	 */
	@Override
	public Souhait addSouhait(Souhait souhait) {

		em.getTransaction().begin();
		em.persist(souhait);
		em.getTransaction().commit();
		em.close();

		return souhait;
	}

	/**
	 * permet d'ajouter une liste
	 */
	@Override
	public Liste addListe(Liste liste) {

		em.getTransaction().begin();
		em.persist(liste);
		em.getTransaction().commit();
		em.close();

		return liste;
	}

}
