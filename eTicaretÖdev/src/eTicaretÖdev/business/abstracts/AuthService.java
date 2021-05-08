package eTicaret÷dev.business.abstracts;

import eTicaret÷dev.entities.concretes.LoginDto;
import eTicaret÷dev.entities.concretes.User;

public interface AuthService {
	
	void register(User user);
	void verify(User user,String token);
	boolean userExists(String eMail);
	void login(LoginDto dto);
	
	

}
