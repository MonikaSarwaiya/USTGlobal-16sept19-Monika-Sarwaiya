package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.onetomany.Pencil;
import com.ustglobal.jpawithhibernateapp.onetomany.PencilBox;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestPencil {

	public static void main(String[] args) {
		
		PencilBox pbox = new PencilBox();
		pbox.setBid(1);
		pbox.setBname("natraaz");
	
		Pencil p = new Pencil();
		p.setColor("grey");
		p.setPencilBox(pbox);
		p.setPid(11);
		
		Pencil p1 = new Pencil();
		p1.setColor("black");
		p1.setPencilBox(pbox);
		p1.setPid(12);
		
		EntityManager entityManager = null;
		EntityTransaction transaction  = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			PencilBox box = entityManager.find(PencilBox.class,1);
			System.out.println(box.getPencil());
			System.out.println(box.getPencil());

//			entityManager.persist(p);
//			entityManager.persist(p1);
			
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
		entityManager.close();
	}
	}
}
