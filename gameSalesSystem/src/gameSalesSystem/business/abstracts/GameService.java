package gameSalesSystem.business.abstracts;

import gameSalesSystem.entity.concrete.Game;

public interface GameService {

	void add(Game game);
	void delete(Game game);
}
