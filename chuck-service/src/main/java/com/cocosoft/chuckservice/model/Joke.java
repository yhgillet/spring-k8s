package com.cocosoft.chuckservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "joke")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Joke {
	@Id
	@Column(name = "joke_id", updatable = false, nullable = false)
	private String id;

	@Column(name = "value")
	private String value;
}
