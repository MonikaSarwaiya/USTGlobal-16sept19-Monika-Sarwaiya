<<<<<<< HEAD
package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product prod = entityManager.find(Product.class, 1);
			System.out.println(entityManager.contains(prod));
			entityManager.detach(prod);
			System.out.println(entityManager.contains(prod));
            Product prod2 = entityManager.merge(prod);
			prod2.setPname("Laptop");
			System.out.println("Record Updated");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
		
	}

}
=======
package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReattachingDemo {

	public static void main(String[] args) {

		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Product prod = entityManager.find(Product.class, 1);
			System.out.println(entityManager.contains(prod));
			entityManager.detach(prod);
			System.out.println(entityManager.contains(prod));
            Product prod2 = entityManager.merge(prod);
			prod2.setPname("Laptop");
			System.out.println("Record Updated");
			entityTransaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
		
	}

}
>>>>>>> 163df58be9dd1ed58e66d470dd49c7970be20870
