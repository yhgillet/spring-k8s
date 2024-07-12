package com.cocosoft.chuckservice.service;

import com.cocosoft.chuckservice.mapper.JokeMapper;
import com.cocosoft.chuckservice.model.JokeDTO;
import com.cocosoft.chuckservice.model.JokeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JokeService {
	private final JokeRepository jokeRepository;

	private final JokeMapper jokeMapper;

	public JokeDTO getRandomJoke() {
		return jokeMapper.toDTO(jokeRepository.getRandomJoke());
	}

}
