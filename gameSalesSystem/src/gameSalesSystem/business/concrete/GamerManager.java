package gameSalesSystem.business.concrete;

import gameSalesSystem.business.abstracts.GamerService;
import gameSalesSystem.core.abstracts.MernisCheckService;
import gameSalesSystem.entity.concrete.Gamer;

public class GamerManager implements GamerService {

	MernisCheckService checkService;
	
	public GamerManager(MernisCheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void add(Gamer gamer) {
		
		if(checkService.checkIfRealPerson(gamer)) {
			System.out.println("Gamer has confirmed : " + gamer.getNationalIdentity() + " " + gamer.getFirstName() + " " + gamer.getLastName());
			System.out.println("Gamer added to database !");
		}else {
			System.out.println("INVALID PERSON");
		}
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

}
