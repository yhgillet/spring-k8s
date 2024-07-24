package com.cocosoft.chuckservice.service;

import com.cocosoft.chuckservice.mapper.JokeMapper;
import com.cocosoft.chuckservice.model.JokeDTO;
import com.cocosoft.chuckservice.model.JokeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
@Transactional
public class JokeService {
	
	private final JokeRepository jokeRepository;

	private final JokeMapper jokeMapper;

	public JokeDTO getRandomJoke() {
		log.info("get random joke");
		return jokeMapper.toDTO(jokeRepository.getRandomJoke());
	}

}
