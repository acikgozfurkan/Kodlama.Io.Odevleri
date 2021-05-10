package business.abstracts;

public interface VerifyService{

	void add(String string);
	
	boolean verification(String eMail , String confirmCode);
}
