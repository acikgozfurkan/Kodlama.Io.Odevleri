package business.concretes;

import business.abstracts.VerifyService;
import entities.abstracts.Entity;


public class VerifyManager implements VerifyService,Entity {


	@Override
	public boolean verification(String eMail, String confirmCode) {
		// TODO Auto-generated method stub
		System.out.println("hesanınız Google ile doğrulandı... ");
		return false;
	}

	@Override
	public void add(String string) {
		// TODO Auto-generated method stub
		System.out.println("hesanınız Google ile doğrulandı... ");
	}

}
