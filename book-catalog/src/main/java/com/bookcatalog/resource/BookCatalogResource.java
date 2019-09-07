package com.bookcatalog.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bookcatalog.models.Book;
import com.bookcatalog.models.CatalogItem;
import com.bookcatalog.models.UserRating;

@RestController
@RequestMapping("/catalog")
public class BookCatalogResource {

	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getBookCatalog(@PathVariable("userId") String userId) {
		
		UserRating ratings = restTemplate.getForObject("http://book-rating/rating/users/"+userId, UserRating.class);
		
		return ratings.getRating().stream().map(rating -> {
			Book book = restTemplate.getForObject("http://book-info/info/"+rating.getBookId(), Book.class);
			return new CatalogItem(book.getBookName(), book.getAuthor(), rating.getRating());
		})
		.collect(Collectors.toList());
		//return Collections.singletonList(new CatalogItem("Rich Dad Poor Dad", "Test", 4));
	}
}
