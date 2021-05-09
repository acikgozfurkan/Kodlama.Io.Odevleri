package concrete;

import abstracts.gamerService;
import entities.Gamer;

public class gamerManager implements gamerService {
	
	
	//private boolean check;
	public gamerManager(Gamer gamer) {
		checkIfRealPerson(gamer);
	}

	@Override
	public void add(Gamer gamer) {
		// TODO Auto-generated method stub
		//System.out.println("gamer eklendi"+gamer.getFirsName());
		
		if(gamer.getId()==1) { // gamer id == 1 ise ekle
			System.out.println("üye eklendi : "+gamer.getFirsName());
		}
		else {
			System.out.println("üye olunamaz : "+gamer.getFirsName());
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		// TODO Auto-generated method stub
		return true;
	}

	
	
}
