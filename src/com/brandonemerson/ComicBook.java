package com.brandonemerson;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Persistence;

import java.io.Serializable;


@Named
@SessionScoped
@Entity
public class ComicBook implements Serializable {
	
	private static final long serialVersionUID = 244668453221233806L;
	@Id @GeneratedValue
	private Long id;
	private String title;
	private String superhero;
	private String publisher;
	private Integer year;	
	
	public ComicBook(){
		
	}
	public ComicBook(String title, String superhero, String publisher, int year){
		setTitle(title);
		setSuperhero(superhero);
		setPublisher(publisher);
		setYear(year);
	}
	
	public String submitComicBook(){
		ComicBook comicBook = new ComicBook(title,superhero,publisher,year);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("thePersistenceUnit");
	    EntityManager em = emf.createEntityManager();
	    
	    EntityTransaction tx = em.getTransaction();
	    tx.begin();
	    em.persist(comicBook);
	    tx.commit();
	    em.close();
	    emf.close();
		return "Submitted?faces-redirect=true";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSuperhero() {
		return superhero;
	}
	public void setSuperhero(String superhero) {
		this.superhero = superhero;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
}
