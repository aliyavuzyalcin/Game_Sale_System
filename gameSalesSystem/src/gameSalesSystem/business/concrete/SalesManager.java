package gameSalesSystem.business.concrete;

import gameSalesSystem.business.abstracts.SalesService;
import gameSalesSystem.entity.concrete.Campaign;
import gameSalesSystem.entity.concrete.Game;
import gameSalesSystem.entity.concrete.Gamer;

public class SalesManager implements SalesService {

	@Override
	public void salesOperation(Gamer gamer, Game game) {
		System.out.println("Purchased is successfull! Details : " + "\n***\\ GAMER INFO /***" + "\nGamer Name : " + gamer.getFirstName() + " " + gamer.getLastName() + 
				"\nGamer Card Number : " + gamer.getCardNumber() + "\nGamer National Identitiy : " +  gamer.getNationalIdentity());
		
		System.out.println("***\\ GAME INFO /***" + "\nGame Name : " + game.getTitle() + "\nGame ID : " + game.getId() + 
				"\nGame Type : " + game.getType() + "\nGame Price : " + game.getPrice());
		
	}

	@Override
	public void salesOperationViaCampaign(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("Purchased is successfull! Details : " + "\n***\\ GAMER INFO /***" + "\nGamer Name : " + gamer.getFirstName() + " " + gamer.getLastName() + 
				"\nGamer Card Number : " + gamer.getCardNumber() + "\nGamer National Identitiy : " +  gamer.getNationalIdentity());
		
		System.out.println("***\\ GAME INFO /***" + "\nGame Name : " + game.getTitle() + "\nGame ID : " + game.getId() + 
				"\nGame Type : " + game.getType() + "\nGame Price : " + game.getPrice());
		
		System.out.println("***\\ CAMPAIGN INFO /***" + "\nCampaign Name : " +  campaign.getName() + "\nCampaign Code : " + campaign.getCode()  + 
				"\nCampaign Time : " + campaign.getDuration() + "\nCampaign Type : " +campaign .getType());
		
	}

}
