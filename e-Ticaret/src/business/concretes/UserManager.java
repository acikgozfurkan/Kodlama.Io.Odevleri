package business.concretes;

import business.abstracts.UserService;
import entities.concretes.User;

public class UserManager implements UserService {
	

	@Override
	public void login(String email, String password) {
		
		//System.out.println("kullanýcý giriþ yaptý. : ");
		
	}
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println("Ad: "+user.getName()+" Soyad :"+user.getLastName()+" e+Mail adresi :"+
		user.getEmail()+" Sisteme kayýt oldunuz....");
		
	}

	@Override
	public void registerGoogle() {
		// TODO Auto-generated method stub
		
	}




}
