package javaProject5;

public class T02VO {
	private String name;
	private String id;
	private String pw;
	private String emailAddress;
	private int phonenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "T02VO [name=" + name + ", id=" + id + ", pw=" + pw + ", emailAddress=" + emailAddress + ", phonenumber="
				+ phonenumber + "]";
	}
	
	
	
}
