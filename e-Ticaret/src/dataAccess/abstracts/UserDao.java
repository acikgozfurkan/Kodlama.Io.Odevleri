package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add(User user);    //User'� database'e ekleme
	void delete(User user); //User'� database'den silme
	
	List<User> getAll();    //User listesini g�ster
	
	

}
