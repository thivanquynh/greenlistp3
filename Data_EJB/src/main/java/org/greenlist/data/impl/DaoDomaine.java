package org.greenlist.data.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.greenlist.data.api.IDaoDomaine;
import org.greenlist.entity.Domaine;
import org.greenlist.entity.Groupe;



@Remote(IDaoDomaine.class)
@Singleton
public class DaoDomaine implements IDaoDomaine{

	@PersistenceContext(unitName = "DATA_EJB")
	private EntityManager em;
	
	private static final String REQUETTE_GET_DOMAINES = "SELECT d FROM Domaine as d ";
	
	
	@Override
	public List<Groupe> getGroupes(Domaine domaine) {
		
		return domaine.getGroupes();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Domaine> getDomaines() {
		Query query = em.createQuery(REQUETTE_GET_DOMAINES);
		return query.getResultList();
	}

}
