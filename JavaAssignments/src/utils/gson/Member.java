package utils.gson;

import java.util.List;

public class Member {

	private String name;
	private String email;
	private int age;
	private List<Family> family;
	
	public Member(String name, String email, int age, List<Family> family) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.family = family;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Family> getFamily() {
		return family;
	}
	public void setFamily(List<Family> family) {
		this.family = family;
	}
}
