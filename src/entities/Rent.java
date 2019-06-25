package entities;

public class Rent {
	
	private String name;
	private String email;
	private int nroom;
	
	public Rent(String name, String email, int nroom) {
		
		this.name = name;
		this.email = email;
		this.nroom = nroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNroom() {
		return nroom;
	}

	public void setNroom(int nroom) {
		this.nroom = nroom;
	}
	
	public  String toString() {
	    return name
	    +"  "
	     +email;
	    
	}
	    
	
	

}
