package org.greenlist.data.impl;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.greenlist.data.api.IDaoUtilisateur;
import org.greenlist.entity.Utilisateur;

@Remote(IDaoUtilisateur.class)
@Singleton
public class DaoUtilisateur implements IDaoUtilisateur {

	@PersistenceContext(unitName="Data_EJB")
	private EntityManager em;
	
	@Override
	public Utilisateur seConnecter(String mail, String mdp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getUtilisateurById(int idUtilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

}
