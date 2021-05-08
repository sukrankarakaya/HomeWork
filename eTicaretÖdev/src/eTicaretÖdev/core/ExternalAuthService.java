package eTicaret÷dev.core;

import eTicaret÷dev.entities.concretes.LoginDto;

public interface ExternalAuthService {
	void register(String eMail);
	boolean userExists(String eMail);
	void login(LoginDto dto);

}
