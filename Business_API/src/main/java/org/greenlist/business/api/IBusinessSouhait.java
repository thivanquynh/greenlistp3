package org.greenlist.business.api;

import java.util.List;

import org.greenlist.entity.Liste;
import org.greenlist.entity.Souhait;
import org.greenlist.entity.Utilisateur;

public interface IBusinessSouhait {
	
	/**
	 *  Methode qui permet de récuperer une liste de Souhait d'un utilisateur
	 * @param objet a enregistrer
	 * @return l'Objet actualisé ( id, date de depot)
	 */
	public List<Souhait> getSouhaits(Utilisateur utilisateur);

	public List<Souhait> getSouhaits(Liste liste);

	public List<Liste> getListes(Utilisateur utilisateur);

	public Souhait getSouhait(Souhait souhait);

	public Souhait addSouhait(Souhait souhait);

	public Liste addListe(Liste liste);
}
