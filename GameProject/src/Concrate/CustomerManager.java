package Concrate;

import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService{
	
	private CustomerCheckService customerCheckService;
	
	public CustomerManager (CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	

	@Override
	public void add(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println(customer.getFirstName()+" "+customer.getLastName()+" Kaydýnýz oluþturuldu.");
			
		}else {
			System.out.println("Malesef kaydýnýz oluþturulamadý.");
		}
		
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName()+customer.getLastName()+" Kaydýnýz silinmiþtir fakat bizden iyisini de bulamazsýnýz.");
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName()+customer.getLastName()+" bilgileriniz güncellendi.");
		
		
	}

}
