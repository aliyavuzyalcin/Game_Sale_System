package gameSalesSystem;

import gameSalesSystem.business.concrete.CampaignManager;
import gameSalesSystem.business.concrete.GameManager;
import gameSalesSystem.business.concrete.GamerManager;
import gameSalesSystem.business.concrete.SalesManager;
import gameSalesSystem.core.concrete.MernisCheckManager;
import gameSalesSystem.entity.concrete.Campaign;
import gameSalesSystem.entity.concrete.Game;
import gameSalesSystem.entity.concrete.Gamer;

public class Main {

	public static void main(String[] args) {
		
	
		Gamer gamer = new Gamer("123456712312", "Ali Yavuz", "Yalçýn", 25, 12345670);
		System.out.println(gamer.getCode());
		
		Game game = new Game(106, "Strategy", "Age of Empires 2", 56.95);
		
		System.out.println("************************************************");
		
		Campaign campaign = new Campaign(2, "BAYRAM", 7);
		System.out.println(campaign.getCode());
		
		System.out.println("************************************************");
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		
		System.out.println("************************************************");
		
		GamerManager gamerManager = new GamerManager(new MernisCheckManager());
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		gamerManager.delete(gamer);
		
		System.out.println("************************************************");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		campaignManager.delete(campaign);
		
		System.out.println("************************************************");
		
		SalesManager salesManager = new SalesManager();
		salesManager.salesOperation(gamer, game);
		salesManager.salesOperationViaCampaign(gamer, game, campaign);
		
		System.out.println("************************************************");
	}
}
