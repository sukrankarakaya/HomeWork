package Concrate;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class OrderManager implements OrderService{

	@Override
	public void sales(Game game, Customer customer) {
		System.out.println(game.getGameName()+" satýn alýndý .Bizi tercih ettiginiz icin teþekkür ederiz "+customer.getFirstName()+".");
		
	}

	@Override
	public void reducedPrice(Game game, Customer customer, Campaign campaign) {
		System.out.println(game.getGameName()+" oyunu "+game.getUnitPrice()+" yerine "+(game.getUnitPrice()-(game.getUnitPrice()*campaign.getDiscount())/100)+" TL'ye satýn alabilirsiniz.");
		
	}

}
