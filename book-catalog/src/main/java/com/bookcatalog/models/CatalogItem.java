package com.bookcatalog.models;

public class CatalogItem {

	private String name;
	private String author;
	private int rating;
	
	public CatalogItem(String name, String author, int rating) {
		super();
		this.name = name;
		this.author = author;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	
}
