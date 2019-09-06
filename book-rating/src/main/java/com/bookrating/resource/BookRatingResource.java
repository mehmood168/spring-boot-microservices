package com.bookrating.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookrating.model.Rating;
import com.bookrating.model.UserRating;

@RestController
@RequestMapping("/rating")
public class BookRatingResource {

	@RequestMapping("/users/{userId}")
	public UserRating getUserRating(@PathVariable("userId") String userId) {
		List<Rating> ratings = Arrays.asList(
				new Rating ("1234", 4),
				new Rating ("5678", 3)
		);
		UserRating userRating = new UserRating();
		userRating.setRating(ratings);
		return userRating;
	}
}
