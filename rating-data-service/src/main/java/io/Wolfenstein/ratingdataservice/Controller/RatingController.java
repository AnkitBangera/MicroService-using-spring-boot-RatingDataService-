package io.Wolfenstein.ratingdataservice.Controller;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.Wolfenstein.ratingdataservice.rating.Rating;
import io.Wolfenstein.ratingdataservice.rating.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
		
	}
	
	@GetMapping("user/{userId}")
	public UserRating getUserRating(@PathVariable String  userId) {
		List<Rating> rating=Arrays.asList(new Rating("123", 4),new Rating("234", 5));
		UserRating userRating=new UserRating();
		userRating.setRating(rating);
		return userRating;
	}
}
