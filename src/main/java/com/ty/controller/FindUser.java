package com.ty.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class FindUser {
	public static void main(String[] args) {
		User user = new User();

		UserDAO dao = new UserDAO();

		User result = dao.findUser(1);
		System.out.println(result);

		System.out.println("Find Sucessfully");
	}
}
