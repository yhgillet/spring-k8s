package com.cocosoft.chuckservice.controller;

import com.cocosoft.chuckservice.model.JokeDTO;
import com.cocosoft.chuckservice.service.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ChuckController {

	private final JokeService jokeService;

	@GetMapping("/random")
	public JokeDTO randomJoke() {
		return jokeService.getRandomJoke();
	}

}
