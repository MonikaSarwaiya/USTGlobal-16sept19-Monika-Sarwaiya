package com.ustglobal.jpawithhibernateapp.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class RetriveDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from Product";
		Query query = entityManager.createQuery(jpql);
		List<Product> list = query.getResultList();
		
		for(Product product : list ) {
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
		}
		entityManager.close();
	}
}
