package org.greenlist.business.api;

import java.util.List;

import org.greenlist.entity.TrancheAge;

public interface IBusinessTrancheAge {

	/**
	 * Permet de recuperer l integralit� des tranches age de la Base
	 * @return la liste des Tranches d age 
	 */
	List<TrancheAge> getTranchesAges();
}
