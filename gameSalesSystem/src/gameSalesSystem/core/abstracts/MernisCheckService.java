package gameSalesSystem.core.abstracts;

import gameSalesSystem.entity.concrete.Gamer;

public interface MernisCheckService {
	
	boolean checkIfRealPerson(Gamer gamer);

}
