package com.ty.school.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.school.dto.User;

public class UserDAO {

	public User saveUser(User user) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();

		return user;
	}

	public User findUser(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User user = entityManager.find(User.class, id);

		if (user != null) {
			return user;
		} else {
			System.out.println("User not Found!!!!");
		}

		return null;
	}

	public boolean deleteUser(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		User user = entityManager.find(User.class, id);
		EntityTransaction entityTransaction = entityManager.getTransaction();

		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			System.out.println("User Deleted Successfully...........");
			return true;
		} else {
			System.err.println("User not Found to deleted !!!");
			return false;
		}
	}

	public User updateUser(User user) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		User user2 = entityManager.find(User.class, user.getId());

		if (user2 != null) {
			entityTransaction.begin();
			entityManager.merge(user);
			entityTransaction.commit();
			System.out.println("Updated Successfully...");
		} else {
			System.out.println("User Not Found to Update!!!!!!!!!!!");
		}
		return user;
	}

}
