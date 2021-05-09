package gameSalesSystem.business.concrete;

import gameSalesSystem.business.abstracts.GameService;
import gameSalesSystem.entity.concrete.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		
		System.out.println("New game added successfully! Details :\n" + "Game ID : " + game.getId() + "\nGame Type : " + game.getType() +
				"\nGame Title : " + game.getTitle() +  "\nGame Price : " + game.getPrice());
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted successfully! Details :\n" + "Game ID : " + game.getId() + "\nGame Type : " + game.getType() +
				"\nGame Title : " + game.getTitle() +  "\nGame Price : " + game.getPrice());
		
	}

}
