package gameSalesSystem.business.abstracts;

import gameSalesSystem.entity.concrete.Campaign;
import gameSalesSystem.entity.concrete.Game;
import gameSalesSystem.entity.concrete.Gamer;

public interface SalesService {
	
	void salesOperation(Gamer gamer, Game game);
	void salesOperationViaCampaign(Gamer gamer, Game game, Campaign campaign);

}
