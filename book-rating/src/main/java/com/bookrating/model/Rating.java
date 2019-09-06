package com.bookrating.model;

public class Rating {

	private String bookId;
	private int rating;
	
	public Rating() {
		super();
	}
	public Rating(String movieId, int rating) {
		super();
		this.bookId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return bookId;
	}
	public void setMovieId(String movieId) {
		this.bookId = movieId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
