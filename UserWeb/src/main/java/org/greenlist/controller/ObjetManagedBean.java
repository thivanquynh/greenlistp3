package org.greenlist.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.greenlist.entity.Objet;
import org.greenlist.entity.Utilisateur;

@ManagedBean(name = "mbObjet")
@ViewScoped
public class ObjetManagedBean {

	@EJB
	private Utilisateur utilisateur;
	@EJB
	private Objet objet;
	
	
}
