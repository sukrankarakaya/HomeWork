import Adapters.MernisServiceAdapter;
import Concrate.CampaignManager;
import Concrate.CustomerManager;
import Concrate.GameManager;
import Concrate.OrderManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {
		
		Game game1 =new Game(1,"League of Legends",56);
		Game game2 =new Game(1,"Rainbow Six Siege",56);
		Game game3 =new Game(1,"Valorant",56);
		
		GameManager gameManager =new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game3);
		
		Customer customer= new Customer(1,"Þükran","Karakaya",2007,Long.parseLong("111111111111"));
		
		CustomerManager customerManager =new CustomerManager(new MernisServiceAdapter());
		customerManager.add(customer);
		
		
		Campaign campaign1 =new Campaign(1, "Bahar Kampanyasý", 50);
		
		
		CampaignManager campaignManager=new CampaignManager();
		
		campaignManager.add(campaign1);
		campaignManager.delete(campaign1);
		campaignManager.update(campaign1);
		
		OrderManager orderManager =new OrderManager();
		orderManager.sales(game3, customer);
		orderManager.reducedPrice(game3, customer, campaign1);

	}

}
