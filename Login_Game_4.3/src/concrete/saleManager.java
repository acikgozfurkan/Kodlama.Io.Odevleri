package concrete;

import abstracts.saleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class saleManager implements saleService{

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		if (campaign.getId()==1) {
		System.out.println(game.getGameName() + "Adl� oyunu "  + campaign.getCampaignName()+ " ile % "+campaign.getDiscountRate()+ " indirimli sat�n ald�n�z");

		} else {
		System.out.println(game.getGameName() + "Adl� oyunu "  + game.getUnitPrice() + " �cret ile sat�n ald�n�z");
	
		}
		
	}

}
