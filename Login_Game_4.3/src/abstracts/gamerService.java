package abstracts;

import entities.Gamer;

public interface gamerService {
	
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	boolean checkIfRealPerson(Gamer gamer);

}
