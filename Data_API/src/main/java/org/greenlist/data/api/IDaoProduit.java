package org.greenlist.data.api;

import java.util.List;

import org.greenlist.entity.Groupe;
import org.greenlist.entity.Produit;

public interface IDaoProduit {

	Groupe getGroupe(Produit produit);
	
	List<Produit> getProduits();
}
