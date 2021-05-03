package Concrate;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}




	@Override
	public void Save(Customer customer) {

		if(customerCheckService.chackIfRealPerson(customer) ) {
			System.out.println("kaydedildi."+ customer.getFirstName());
		}else {
			System.out.println("Malesef kaydýnýz oluþturulamadý.");
			
		}
		
	}

}
