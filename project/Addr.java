package practice;

public class Addr {
	private String name;
	private String number;
	private String email;
	private String address;
	private String group;
	
	public void printInfo() {
		System.out.println(name + ", " + number + ", " + email + ", " + address + ", " + group);
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;
		return name;
	}
	public String getNumber() {
		return number;
	}
	public String setNumber(String number) {
		this.number = number;
		return number;
	}
	public String getEmail() {
		return email;
	}
	public String setEmail(String email) {
		this.email = email;
		return email;
	}
	public String getAddress() {
		return address;
	}
	public String setAddress(String address) {
		this.address = address;
		return address;
	}
	public String getGroup() {
		return group;
	}
	public String setGroup(String group) {
		this.group = group;
		return group;
	}
	
	public Addr(String name, String number, String email, String address, String group) {
	this.name = name;
	this.number = number;
	this.email = email;
	this.address = address;
	this.group = group;
	}
	
}
