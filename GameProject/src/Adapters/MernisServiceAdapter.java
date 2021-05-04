package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{
	

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		try {KPSPublicSoap mernisValidation = new KPSPublicSoapProxy();
		return mernisValidation.TCKimlikNoDogrula(customer.getNationalityNo(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getBirthDay());
		}
		catch (Exception e) {
			return false;
		}
	}
	
	

}
