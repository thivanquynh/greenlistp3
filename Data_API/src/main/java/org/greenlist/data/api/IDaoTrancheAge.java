package org.greenlist.data.api;

import java.util.List;

import org.greenlist.entity.TrancheAge;

public interface IDaoTrancheAge {

	/**
	 * permet de recuperer la totalit� des tranches d'ages pr�sentes dans le SI
	 * @return la liste des tranches d'ages
	 */
	List<TrancheAge> getTranchesAges()throws Exception;
	
}
