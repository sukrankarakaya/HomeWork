package eTicaretÖdev.core;

import eTicaretÖdev.business.abstracts.UserService;
import eTicaretÖdev.entities.concretes.LoginDto;
import eTicaretÖdev.entities.concretes.User;

public class GoogleAuthManagerAdapter implements ExternalAuthService {
	private UserService userservice;

	public GoogleAuthManagerAdapter(UserService userservice) {
		super();
		this.userservice = userservice;
	}

	@Override
	public void register(String eMail) {
		if (userExists(eMail) == false) {
			userservice.add(null);
		} else {
			User user = userservice.get(eMail);

			LoginDto dto = new LoginDto();
			dto.seteMail(user.geteMail());
			dto.setPassword(user.getPassword());

			login(dto);
		}
	}

	@Override
	public boolean userExists(String eMail) {
		if (userservice.get(eMail) != null) {
			return true;
		}
		return false;

	}

	@Override
	public void login(LoginDto dto) {
		if (dto!=null && dto.getPassword().equals(dto.getPassword())) {
			System.out.println("Baþarýyla giriþ yapildý.");
		}
		else {
			System.out.println("Kullanýcý adý ve ya þifreniz yanlýþ.");
		}

	}

}
