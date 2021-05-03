import Abstract.BaseCustomerManager;
import Adepters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager =new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.Save(new Customer(1,"Þükran","Karakaya",2001,"11111111111"));
		
		
		BaseCustomerManager customerManager2 =new NeroCustomerManager();
		customerManager2.Save(new Customer(2,"Hakan","Akkaya",1998,"25956478123"));
		
		
	}

}
