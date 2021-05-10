package business.abstracts;

import entities.concretes.User;

public interface AuthService {

	void register(User user); // kullan�c� kayd� ba�ar�l� ise kaydet.
	void login(String email, String password); // giri� yapmak i�in email ve �ifre
	
}
