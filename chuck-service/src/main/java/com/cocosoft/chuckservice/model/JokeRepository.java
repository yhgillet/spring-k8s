package com.cocosoft.chuckservice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JokeRepository extends JpaRepository<Joke, String> {

	@Query(nativeQuery = true, value = """
			SELECT  j.joke_id, j.value FROM joke AS j 
			ORDER BY RANDOM() LIMIT 1
			""")
	Joke getRandomJoke();

}
