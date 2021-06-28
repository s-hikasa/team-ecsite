package jp.co.internous.wasabi.model.domain;

import java.sql.Timestamp;

public class MstUser {
	
	//* mst_user.id Primary key
	private int id;

	//* mst_user.user_name
	private String userName;
	
	//* mst_user.password
	private String password;
	
	//* mst_user.family_name
	private String familyName;
	
	//* mst_user.first_name
	private String firstName;
	
	//* mst_user.family_name_kana
	private String familyNameKana;
	
	//* mst_user.first_name_kana
	private String firstNameKana;
	
	//* mst_user.gender
	private int gender;
	
	//* mst_user.created_at
	private Timestamp createdAt;
	
	//* mst_user.updated_at
	private Timestamp updatedAt;
	
	
	public MstUser() {} ;
	
	public MstUser(int id,
					String userName,
					String password,
					String familyName,
					String firstName,
					String familyNameKana,
					String firstNameKana,
					int gender,
					Timestamp createdAt,
					Timestamp updatedAt) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.familyName = familyName;
		this.firstName = firstName;
		this.familyNameKana = familyNameKana;
		this.firstNameKana = firstNameKana;
		this.gender = gender;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	//*以下setter,getter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
	
	
	
	

