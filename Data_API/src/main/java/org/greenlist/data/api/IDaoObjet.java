package org.greenlist.data.api;

import java.util.List;

import org.greenlist.entity.Domaine;
import org.greenlist.entity.Groupe;
import org.greenlist.entity.Objet;
import org.greenlist.entity.Produit;
import org.greenlist.entity.Utilisateur;

public interface IDaoObjet {
	
	Objet getObjetById(int idObjet) throws Exception;
	Objet createObjet(Objet objet)throws Exception;
	List<Objet> getObjetsByUtilisateur(Utilisateur utilisateur)throws Exception;
	List<Objet> getObjetsByLibelle(String libelle)throws Exception;
	List<Objet> getObjetsByDomaine(Domaine domaine)throws Exception;
	List<Objet> getObjetsByGroupe(Groupe groupe)throws Exception;
	List<Objet> getObjetsByProduit(Produit produit)throws Exception;
	

}
