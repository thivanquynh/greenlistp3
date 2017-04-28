package org.greenlist.data.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.greenlist.data.api.IDaoObjet;
import org.greenlist.entity.Objet;

@Remote(IDaoObjet.class)
@Singleton
public class DaoObjet implements IDaoObjet {
	
	@PersistenceContext(unitName = "DATA_EJB")
	private EntityManager em;
	
/**
 * Methode pour récupérer un objet par son id
 */
	@Override
	public Objet getObjetById(int idObjet) {
		final String req = 
				"SELECT o FROM Objet o WHERE o.id = :pidObjet";
		Query query = em.createQuery(req).setParameter("pidObjet", idObjet);
		return (Objet) query.getSingleResult();
	}

	@Override
	public Objet createObjet(Objet objet) {
		final String req = 
				"INSERT INTO Objet o (o) VALUE (:pObjet)";
		Query query = em.createQuery(req).setParameter("pObjet", objet);
		return (Objet) query.getSingleResult();
	}
	

	@Override
	public List<Objet> getObjetsByUtilisateur(int idUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Objet getObjet(String libelle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Objet> getObjetsByDomaine(String domaine) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Objet> getObjetsByGroupe(String groupe) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Objet> getObjetsByProduit(String produit) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
