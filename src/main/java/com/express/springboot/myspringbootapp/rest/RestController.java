package com.express.springboot.myspringbootapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	@GetMapping("/")
	public String display() {

		return "Hello world with" + LocalDateTime.now();

	}

	@GetMapping("/teaminfo")
	public String displayHello() {

		return "Coach:" + coachName + ",Team Name:" + teamName;

	}
}
