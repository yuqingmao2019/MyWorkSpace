package test;

import java.util.Date;

public class Person {
	public String name;
	public int age;
	public Date birthDate;
	public String getInfo() {
	System.out.println("获取信息哦");
	return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	} 
	public  String show(){
		return name;
	}
	
}
