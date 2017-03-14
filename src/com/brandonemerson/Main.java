package com.brandonemerson;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
	  public static void main(String[] args) {
		  //ComicBook comicBook =new ComicBook("Moon Knight Meets Spiderman", "Moon Knight", "Marvel Comics", 1975);
		  ComicBook comicBook =new ComicBook("Moon Knight Meets Spiderman", "Moon Knight", "Marvel Comics", 1975);
		  
	      EntityManagerFactory emf = Persistence.createEntityManagerFactory("thePersistenceUnit");
	      EntityManager em = emf.createEntityManager();
	    
	      EntityTransaction tx = em.getTransaction();
	      tx.begin();
	      em.persist(comicBook);
	      tx.commit();
	      em.close();
	      emf.close();
	  }
	}
