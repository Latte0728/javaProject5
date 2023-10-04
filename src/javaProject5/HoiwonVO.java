package javaProject5;

public class HoiwonVO {
	private int idx;
	private	String id;
	private String pw;
	private String phonenumber;
	private String address;
	private String name;
	
	public int getIdx() {
		return idx;
	}	
	public void setIdx(int idx) {
		this.idx = idx;
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
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "HoiwonVO [idx=" + idx + ", id=" + id + ", pw=" + pw + ", phonenumber=" + phonenumber + ", address="
				+ address + ", name=" + name + "]";
	}
	

	
}