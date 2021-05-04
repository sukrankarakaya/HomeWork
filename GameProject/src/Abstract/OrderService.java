package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface OrderService {
	
	void sales(Game game, Customer customer);
	
	void reducedPrice(Game game, Customer customer,Campaign campaign);
	
	

}
