package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void login(String email, String password);  //Kullan�c� sisteme giri� yapabilir(e-posta ve �ifreyle)
	void register(User user);	        		//Kullan�c� sisteme kaydolabilir(Do�rulamalar� ge�erse)
	void registerGoogle();
}
