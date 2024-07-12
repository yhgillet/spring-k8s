package com.cocosoft.chuckservice.mapper;

import com.cocosoft.chuckservice.model.Joke;
import com.cocosoft.chuckservice.model.JokeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface JokeMapper {

	@Mapping(target = "joke", source = "value")
	JokeDTO toDTO(Joke joke);
}
