package org.greenlist.data.api;

import org.greenlist.entity.Utilisateur;

public interface IDaoUtilisateur {

	public Utilisateur seConnecter (String mail, String mdp);
	
	public Utilisateur getUtilisateurById(int idUtilisateur);
}
