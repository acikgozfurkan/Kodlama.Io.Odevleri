package business.abstracts;

public interface SendMailService {
	
	public String sendMail(String email);
	
	public boolean verify(String email, String confirmCode);

}
