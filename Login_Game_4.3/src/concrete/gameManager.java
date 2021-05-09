package concrete;

import abstracts.gameService;
import entities.Game;

public class gameManager implements gameService {

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		System.out.println("Oyun Eklendi : "+game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun Silindi ! : "+game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}
	
	

}
