package eTicaret÷dev.core.amazonEmail;

import eTicaret÷dev.amazonEmail.AmazonMailManager;
import eTicaret÷dev.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService{

	private AmazonMailManager amazonMailManager;
	
	
	
	public AmazonMailManagerAdapter() {
		super();
		this.amazonMailManager = new AmazonMailManager();
	}



	@Override
	public void send(String eMail, String massage) {
		amazonMailManager.send(eMail, massage);
		
	}

}
