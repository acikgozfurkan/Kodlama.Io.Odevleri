package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void login(String email, String password);  //Kullanýcý sisteme giriþ yapabilir(e-posta ve þifreyle)
	void register(User user);	        		//Kullanýcý sisteme kaydolabilir(Doðrulamalarý geçerse)
	void registerGoogle();
}
