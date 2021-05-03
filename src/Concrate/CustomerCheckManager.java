package Concrate;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean chackIfRealPerson(Customer customer) {
		
		return false;
	}

}
