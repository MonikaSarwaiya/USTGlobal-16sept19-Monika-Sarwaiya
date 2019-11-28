<<<<<<< HEAD
package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteDemo {

public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction transaction  = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "delete from Product where pid=:id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", 3);
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
		entityManager.close();
	}
	}

}
=======
package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteDemo {

public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction transaction  = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "delete from Product where pid=:id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", 3);
			int result = query.executeUpdate();
			System.out.println(result);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
		entityManager.close();
	}
	}

}
>>>>>>> 163df58be9dd1ed58e66d470dd49c7970be20870
