package entities;

public class Gamer {
	private int id;
	private String userName;
	private String firsName;
	private String lastName;
	private String age;
	private String nationalityId;
	private String bornDate;
	
	public Gamer() {
		
	}

	public Gamer(int id, String userName, String firsName, String lastName, String age, String nationalityId,
			String bornDate) {
		super();
		this.id = id;
		this.userName = userName;
		this.firsName = firsName;
		this.lastName = lastName;
		this.age = age;
		this.nationalityId = nationalityId;
		this.bornDate = bornDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getBornDate() {
		return bornDate;
	}

	public void setBornDate(String bornDate) {
		this.bornDate = bornDate;
	}
	

}
