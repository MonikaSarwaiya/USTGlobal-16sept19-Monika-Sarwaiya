<<<<<<< HEAD
package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class Test {

	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("Monika");
		
		Person p = new Person();
		p.setPid(1);
		p.setName("Monika");
		p.setVoterCard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction transaction  = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class,10);
			System.out.println(vCard.getPerson().getPid());
			System.out.println(vCard.getPerson().getName());

//			entityManager.persist(p);
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
=======
package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.onetoone.Person;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class Test {

	public static void main(String[] args) {

		VoterCard vc = new VoterCard();
		vc.setVid(10);
		vc.setVname("Monika");
		
		Person p = new Person();
		p.setPid(1);
		p.setName("Monika");
		p.setVoterCard(vc);
		
		EntityManager entityManager = null;
		EntityTransaction transaction  = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			VoterCard vCard = entityManager.find(VoterCard.class,10);
			System.out.println(vCard.getPerson().getPid());
			System.out.println(vCard.getPerson().getName());

//			entityManager.persist(p);
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
>>>>>>> 163df58be9dd1ed58e66d470dd49c7970be20870
