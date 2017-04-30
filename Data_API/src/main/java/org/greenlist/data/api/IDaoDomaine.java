package org.greenlist.data.api;

import java.util.List;

import org.greenlist.entity.Domaine;
import org.greenlist.entity.Groupe;

public interface IDaoDomaine {
	/**
	 * Methode pour determiner l'ensemble des Groupes appartenant au domaine . 
	 * @param domaine le domaine dont on veut connaitre les groupes 
	 * @return une liste des groupes
	 */
	 List<Groupe> getGroupes(Domaine domaine);
	
	 List<Domaine> getDomaines();
}
