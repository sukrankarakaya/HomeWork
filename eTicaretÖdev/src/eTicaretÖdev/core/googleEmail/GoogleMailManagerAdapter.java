package eTicaret÷dev.core.googleEmail;

import eTicaret÷dev.core.EmailService;
import eTicaret÷dev.googleEmail.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailService{
	
	private GoogleMailManager googleMailManager;
	

	public GoogleMailManagerAdapter() {
		super();
		this.googleMailManager =new  GoogleMailManager();
	}


	@Override
	public void send(String eMail, String massage) {
		googleMailManager.send(eMail, massage);
		
		
	}

}
