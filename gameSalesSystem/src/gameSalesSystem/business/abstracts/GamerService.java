package gameSalesSystem.business.abstracts;

import gameSalesSystem.entity.concrete.Gamer;

public interface GamerService {

	void add(Gamer gamer);
	void update(Gamer gamer);
	void delete(Gamer gamer);
}
