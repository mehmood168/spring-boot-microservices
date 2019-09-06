package com.bookinfo.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookinfo.resource.model.Book;

@RestController
@RequestMapping("/info")
public class BookInfoResource {

	@RequestMapping("/{bookId}")
	public Book getBookInfo(@PathVariable("bookId") String bookId) {
		return new Book(bookId, "Rich Dad Poor Dad", "Robert Kiyosaki");
	}
}
