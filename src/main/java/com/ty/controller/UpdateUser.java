package com.ty.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class UpdateUser {
	public static void main(String[] args) {

		User user = new User();
		user.setId(3);
		user.setName("jhjdf");
		user.setAddress("hdffd");
		user.setEmail("kjkj");
		user.setGender("male");
		user.setPhone(79934343434l);
		user.setPassword("123");

		UserDAO dao = new UserDAO();

		User result = dao.updateUser(user);
		//System.out.println(result);

	}
}
