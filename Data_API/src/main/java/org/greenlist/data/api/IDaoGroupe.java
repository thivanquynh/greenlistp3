package org.greenlist.data.api;

import java.util.List;

import org.greenlist.entity.Groupe;
import org.greenlist.entity.Produit;

public interface IDaoGroupe {

	 List<Produit> getProduits(Groupe groupe);
	 
	 List<Groupe> getGroupes();
}
