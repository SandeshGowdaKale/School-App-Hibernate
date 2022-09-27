package com.ty.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class SaveUser {
	public static void main(String[] args) {

		User u = new User();
		u.setName("ma");
		u.setPhone(883558149l);
		u.setAddress("banglaore");
		u.setPassword("123");
		u.setEmail("ma@123");
		u.setGender("female");

		UserDAO dao = new UserDAO();

		User result = dao.saveUser(u);
		System.out.println(result);
		System.out.println("Saved Successfully!!!");
	}
}
