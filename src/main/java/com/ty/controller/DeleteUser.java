package com.ty.controller;

import com.ty.school.dao.UserDAO;
import com.ty.school.dto.User;

public class DeleteUser {
	
	public static void main(String[] args) {
		User user  = new User();
		UserDAO dao = new UserDAO();
		
		boolean result = dao.deleteUser(1);
		//System.out.println(result);
	}

}
