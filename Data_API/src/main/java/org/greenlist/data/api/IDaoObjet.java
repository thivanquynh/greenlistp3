package org.greenlist.data.api;

import java.util.List;

import org.greenlist.entity.Objet;

public interface IDaoObjet {
	
	Objet getObjetById(int idObjet);
	Objet createObjet(Objet objet);
	List<Objet> getObjetsByUtilisateur(int idUtilisateur);
	Objet getObjet(String libelle);

	List<Objet> getObjetsByDomaine(String domaine);
	List<Objet> getObjetsByGroupe(String groupe);
	List<Objet> getObjetsByProduit(String produit);

}
