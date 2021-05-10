package business.abstracts;

import entities.concretes.User;

public interface AuthService {

	void register(User user); // kullanýcý kaydý baþarýlý ise kaydet.
	void login(String email, String password); // giriþ yapmak için email ve þifre
	
}
