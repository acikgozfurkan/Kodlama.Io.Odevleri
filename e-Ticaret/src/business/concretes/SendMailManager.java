package business.concretes;

import java.util.Random;

import business.abstracts.SendMailService;

public class SendMailManager implements SendMailService{

	@Override
	public String sendMail(String eMail) {
		// TODO Auto-generated method stub
		//return null;
		Random rnd = new Random();
		int confirmCode = rnd.nextInt(999999);
		System.out.println("Hesap onay kodu : " + confirmCode);
		return String.valueOf(confirmCode);
	}

	@Override
	public boolean verify(String eMail, String confirmCode) {
		// TODO Auto-generated method stub
		return false;
	}

}
