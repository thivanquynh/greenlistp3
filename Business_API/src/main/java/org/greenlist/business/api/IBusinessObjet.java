package org.greenlist.business.api;

import java.util.List;

import org.greenlist.entity.Objet;
import org.greenlist.entity.Utilisateur;

public interface IBusinessObjet {

	/**
	 *  Methode qui permet d'enregistrer un OBjet dans le SI
	 * @param objet a enregistrer
	 * @return l'Objet actualis� ( id, date de depot)
	 */
	public Objet creerObjet(Objet objet );
	
	
	/**
	 * M�thode qui permet d'obtenir une list d'objet d'un utilisateur
	 * @param utilisateur
	 * @return la liste d'objet de l'utilisateur 
	 */
	public List<Objet> getObjets(Utilisateur utilisateur);
	
	/**
	 * M�thode qui permet d'obtenir les informations d'un objet � partir de ce dernier
	 * @param objet que l'on rechercher
	 * @return l'Objet Complet 
	 */
	public Objet getObjet(Objet objet);
	
}
