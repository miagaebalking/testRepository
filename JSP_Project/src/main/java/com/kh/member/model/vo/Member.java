package com.kh.member.model.vo;

import java.sql.Date;

public class Member {
	// Member 테이블에 맞춰서 필드 작성/get/set/toString 생성자 만들기
	private int userNo;
	private String userId;
	private String userPwd;
	private String userName;
	private String userPhone;
	private String userEmail;
	private String userAddress;
	private String userInterest;
	private Date userEnrollDate;
	private Date userModifyDate;
	private String status;
	
	public Member() {
		super();
	}

	public Member(int userNo, String userId, String userPwd, String userName, String userPhone, String userEmail,
			String userAddress, String userInterest, Date userEnrollDate, Date userModifyDate, String status) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userInterest = userInterest;
		this.userEnrollDate = userEnrollDate;
		this.userModifyDate = userModifyDate;
		this.status = status;
	}

	

	public Member(String userId, String userPwd, String userName, String userPhone, String userEmail,
			String userAddress, String userInterest) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userInterest = userInterest;
	}
	

	public Member(String userId, String userName, String userPhone, String userEmail, String userAddress,
			String userInterest) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userAddress = userAddress;
		this.userInterest = userInterest;
	}

	public Member(int userNo, String userPwd) {
		super();
		this.userNo = userNo;
		this.userPwd = userPwd;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserInterest() {
		return userInterest;
	}

	public void setUserInterest(String userInterest) {
		this.userInterest = userInterest;
	}

	public Date getUserEnrollDate() {
		return userEnrollDate;
	}

	public void setUserEnrollDate(Date userEnrollDate) {
		this.userEnrollDate = userEnrollDate;
	}

	public Date getUserModifyDate() {
		return userModifyDate;
	}

	public void setUserModifyDate(Date userModifyDate) {
		this.userModifyDate = userModifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName
				+ ", userPhone=" + userPhone + ", userEmail=" + userEmail + ", userAddress=" + userAddress
				+ ", userInterest=" + userInterest + ", userEnrollDate=" + userEnrollDate + ", userModifyDate="
				+ userModifyDate + ", status=" + status + "]";
	}
	
	
}
