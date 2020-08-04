package io.Wolfenstein.ratingdataservice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.Wolfenstein.ratingdataservice.rating.Rating;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId) {
		return new Rating(movieId, 4);
		
	}
}
