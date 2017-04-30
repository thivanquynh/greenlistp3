package org.greenlist.business.impl;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import org.greenlist.business.api.IBusinessDomaine;
import org.greenlist.data.api.IDaoDomaine;
import org.greenlist.entity.Domaine;
import org.greenlist.entity.Groupe;

@Remote(IBusinessDomaine.class)
@Stateless
public class BusinessDomaine implements IBusinessDomaine {
	
	@EJB
	private IDaoDomaine proxyObjet;
	
	@Override
	public List<Groupe> getGroupes(Domaine domaine) {
		return proxyObjet.getGroupes(domaine);
	}

	@Override
	public List<Domaine> getDomaines() {
		return proxyObjet.getDomaines();
	}

}
