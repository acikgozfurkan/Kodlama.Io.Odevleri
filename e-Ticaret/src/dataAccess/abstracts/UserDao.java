package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);    //User'ý database'e ekleme
	void delete(User user); //User'ý database'den silme
	
	List<User> getAll();    //User listesini göster
	
	

}
