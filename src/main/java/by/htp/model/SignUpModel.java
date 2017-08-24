package by.htp.model;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class SignUpModel {
	
	@NotNull
	private String name;
	
	@NotNull
	@Pattern(regexp = "^.+@.+\\..+$")
	private String email;
	
	@NotNull
	private String password;
	
	@NotNull
	private String sex;
	
	@NotNull
	@Min(18)
	private Integer age;
	
	@NotNull
	private String biography;
	
	@NotNull
	private String job;
	
	@NotNull
	private String english;
	
	private List<String> interest;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getEnglish() {
		return english;
	}

	public void setEnglish(String english) {
		this.english = english;
	}

	public List<String> getInterest() {
		return interest;
	}

	public void setInterest(List<String> interest) {
		this.interest = interest;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "SignUpModel [name=" + name + ", email=" + email + ", password=" + password + ", age=" + age
				+ ", biography=" + biography + ", job=" + job + ", english=" + english + ", interest=" + interest + "]";
	}

}
