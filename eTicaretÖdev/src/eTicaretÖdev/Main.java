package eTicaretÖdev;

import java.util.List;

import eTicaretÖdev.business.concretes.AuthManager;
import eTicaretÖdev.business.concretes.UserManager;
import eTicaretÖdev.core.amazonEmail.AmazonMailManagerAdapter;
import eTicaretÖdev.core.googleEmail.GoogleMailManagerAdapter;
import eTicaretÖdev.dataAccess.concretes.InMemoryUserDao;
import eTicaretÖdev.entities.abstracts.Dto;
import eTicaretÖdev.entities.concretes.LoginDto;
import eTicaretÖdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		InMemoryUserDao inMemoryUserDao=new InMemoryUserDao();
		AuthManager authManager=new AuthManager(new UserManager(inMemoryUserDao, 
				new AmazonMailManagerAdapter()));
			
		User burcu=new User(2,"Burcu","kaplan","burcu@gmail.com","123456",true);
		User fılız=new User(3,"filiz","yılmaz","fılız@gmail.com","123456",true);
		
		
		authManager.register(burcu);
		
		
		UserManager userManager=new UserManager(inMemoryUserDao, new GoogleMailManagerAdapter());
		//userManager.update(enes);
		//userManager.delete(3);
		//userManager.getAll();
		
		LoginDto userDto=new LoginDto();
		userDto.seteMail("suko@gmail.com");
		userDto.setPassword("123456");
		
		//authManager.login(userDto);
		
	}

}
