package org.greenlist.data.impl;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.greenlist.data.api.IDaoUtilisateur;
import org.greenlist.entity.Utilisateur;

@Remote(IDaoUtilisateur.class)
@Singleton
public class DaoUtilisateur implements IDaoUtilisateur {

	private static final String REQUETE_CONNEXION = "SELECT u FROM Utilisateur u WHERE u.pseudo = :pPseudo AND u.password = :pMdp";

	private static final String REQUETE_GET_USER_BY_ID = "SELECT u FROM Utilisateur u WHERE u.id = :pId";

	@PersistenceContext(unitName = "Data_EJB")
	private EntityManager em;

	/*
	 * Récupération de l'utilisateur souhaite se connecter à partir de son
	 * pseudo et son mdp.
	 * 
	 * @param pseudo le pseudo de l'utilisateur
	 * 
	 * @param mdp le mot de passe de l'utilisateur
	 * 
	 * @return l'utilisateur connecté. Renvoie l'utilisateur si les pseudo et
	 * mdp sont les bons, remonte une exception sinon.
	 */
	@Override
	public Utilisateur seConnecter(String pseudo, String mdp) throws Exception{
		Query query = em.createQuery(REQUETE_CONNEXION);
		query.setParameter("pPseudo", pseudo);
		query.setParameter("pMdp", mdp);
		return (Utilisateur) query.getSingleResult();
	}

	/*
	 * Récupération d'un utilisateur à partir de son ID.
	 * 
	 * @param idUtilisateur l'id de l'utilisateur cherché
	 * 
	 * @return l'utilisateur cherché. Renvoie l'utilisateur si l'ID existe, et
	 * remonte une exception sinon.
	 */
	@Override
	public Utilisateur getUtilisateurById(int idUtilisateur) throws Exception {
		Query query = em.createQuery(REQUETE_GET_USER_BY_ID);
		query.setParameter("pId", idUtilisateur);
		return (Utilisateur) query.getSingleResult();
	}

}
