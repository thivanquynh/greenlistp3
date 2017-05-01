package org.greenlist.business.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.greenlist.business.api.IBusinessObjet;
import org.greenlist.data.api.IDaoObjet;
import org.greenlist.entity.Objet;
import org.greenlist.entity.Utilisateur;

@Remote(IBusinessObjet.class)
@Stateless
public class BusinessObjet implements IBusinessObjet {

	@EJB
	private IDaoObjet proxyObjet;

	@Override
	public Objet creerObjet(Objet objet) {
		Objet obj = null;
		try {
			obj = proxyObjet.createObjet(objet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public List<Objet> getObjets(Utilisateur utilisateur) {
		List<Objet> objets = null;
		try {
			objets = proxyObjet.getObjetsByUtilisateur(utilisateur);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objets;
	}

	@Override
	public Objet getObjet(Objet objet) {
		Objet obj = null;
		try {
			obj = proxyObjet.getObjetById(objet.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
