package gameSalesSystem.core.concrete;

import gameSalesSystem.core.abstracts.MernisCheckService;
import gameSalesSystem.entity.concrete.Gamer;

public class MernisCheckManager implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		if(gamer.getNationalIdentity().isEmpty() == false && gamer.getAge() >= 18) {
			
			return true;
		}else {
			
			return false;
		}
	}

}
