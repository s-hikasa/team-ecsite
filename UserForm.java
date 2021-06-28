package jp.co.internous.wasabi.model.form;

import java.io.Serializable;

public class UserForm implements Serializable{

	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String userName;
	
	private String password;
	private String newPassword;
	private String newPasswordConfirm;
	
	private String familyName;
	
	private String firstName;
	
	private String familyNameKana;
	
	private String firstNameKana;
	
	private int gender;
	
	
	
	//* 以下setter/getter
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getNewPassword() {
		return newPassword;
	}

	public String getNewPasswordConfirm() {
		return newPasswordConfirm;
	}
	
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	public String getFamilyName() {
		return familyName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	
	public String getFirstNameKana() {
		return firstNameKana;
	}
	
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	public int getGender() {
		return gender;
	}
	
	
}
