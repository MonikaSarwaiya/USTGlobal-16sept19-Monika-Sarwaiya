<<<<<<< HEAD
package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestManyToMany {

	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("JAVA");
		
		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("JDBC");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c1);
		al.add(c2);
		
		Student s1 = new Student();
		s1.setSid(10);
		s1.setSname("Monika");
		s1.setCourse(al);
		 
		
		EntityManager entityManager = null;
		EntityTransaction transaction  = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Course course= entityManager.find(Course.class,1);
			System.out.println(course.getCid());
			System.out.println(course.getCname());
//			entityManager.persist(s1);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
=======
package com.ustglobal.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;
import com.ustglobal.jpawithhibernateapp.onetoone.VoterCard;

public class TestManyToMany {

	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("JAVA");
		
		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("JDBC");
		
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(c1);
		al.add(c2);
		
		Student s1 = new Student();
		s1.setSid(10);
		s1.setSname("Monika");
		s1.setCourse(al);
		 
		
		EntityManager entityManager = null;
		EntityTransaction transaction  = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Course course= entityManager.find(Course.class,1);
			System.out.println(course.getCid());
			System.out.println(course.getCname());
//			entityManager.persist(s1);
			System.out.println("record saved");
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
>>>>>>> 163df58be9dd1ed58e66d470dd49c7970be20870
