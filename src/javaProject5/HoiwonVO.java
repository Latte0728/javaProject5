package javaProject5;

public class HoiwonVO {
	private int idx;
	private	String id;
	private String pw;
	private int phonenumber;
	private String address;
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	
	public void setid(String id) {
		this.id = id;
		
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "HoiwonVO [idx=" + idx + ", id=" + id + ", pw=" + pw + ", phonenumber=" + phonenumber + ", address="
				+ address + "]";
	}
}