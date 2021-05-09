import concrete.campaignManager;
import concrete.gameManager;
import concrete.gamerManager;
import concrete.saleManager;
import entities.Campaign;
import entities.Game;
import entities.Gamer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gamer gamer =  new Gamer(1,"ahmet","ahbaþak","baþak","30","Turkey","23-04-1991");
		gamerManager gamerManager = new gamerManager(gamer);
		gamerManager.add(gamer);
		
		Game game1 = new Game(1," GTA 5 ",127.50);
		Game game2 = new Game(2," Call of duty ",137);
		gameManager gameManager = new gameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.delete(game2);
		
		Campaign campaign1 = new Campaign(1, "mayýs kapmanyasý ", 25);
		
		campaignManager campaignManager = new campaignManager();
		campaignManager.add(campaign1);
		
		saleManager saleManager = new saleManager();
		saleManager.sale(gamer, game2,campaign1);
		
		
		
		
		

	}

}
