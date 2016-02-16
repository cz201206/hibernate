package cz.pojo;

import java.util.Date;



public class Person {
	private Integer id;
	private String name;
	private String password;
	private Date birthday;
	public Person() {
	}
	public Person(String name, String password, Date birthday) {
		super();
		this.name = name;
		this.password = password;
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", password=" + password
				+ ", birthday=" + birthday + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	
}
