package abstracts;

import entities.Campaign;
import entities.Game;
import entities.Gamer;

public interface saleService {
	
	void sale(Gamer gamer,Game game, Campaign campaign);

}
