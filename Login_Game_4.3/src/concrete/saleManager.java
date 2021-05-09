package concrete;

import abstracts.saleService;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class saleManager implements saleService{

	@Override
	public void sale(Gamer gamer, Game game, Campaign campaign) {
		if (campaign.getId()==1) {
		System.out.println(game.getGameName() + "Adlý oyunu "  + campaign.getCampaignName()+ " ile % "+campaign.getDiscountRate()+ " indirimli satýn aldýnýz");

		} else {
		System.out.println(game.getGameName() + "Adlý oyunu "  + game.getUnitPrice() + " Ücret ile satýn aldýnýz");
	
		}
		
	}

}
