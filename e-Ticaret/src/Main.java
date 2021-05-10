import business.abstracts.SendMailService;
import business.abstracts.UserService;
import business.abstracts.VerifyService;
import business.concretes.SendMailManager;
import business.concretes.UserManager;
import business.concretes.VerifyManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"BEYZA","TEK","beyzatek58@gmail.com","beyza123");
		UserService userService1 = new UserManager();
		userService1.register(user1);
		
		SendMailService sendMailServiceCode = new SendMailManager();
		sendMailServiceCode.sendMail(user1.getEmail());
		
		VerifyService verifyService1 = new VerifyManager();
		verifyService1.verification(user1.getEmail(),user1.getPassword());
		
		
		userService1.login("facikgoz@gmail.com", "furki123");
		
		HibernateUserDao hibernateUserDao1 = new HibernateUserDao();
		hibernateUserDao1.add(user1);
		
		 //UserManager userManager = new UserManager();
		 //userManager.add("facikgoz@gmail.com", "furki123");
		 
		

	}

}
