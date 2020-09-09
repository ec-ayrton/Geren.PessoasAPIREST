package com.ayrton.gerenpersoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ayrton.gerenpersoapi.dto.response.MessageResponseDTO;
import com.ayrton.gerenpersoapi.entity.Person;
import com.ayrton.gerenpersoapi.service.PersonService;

@RestController
@RequestMapping("/people")
public class PersonController {

	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public MessageResponseDTO CreatePerson(@RequestBody Person person) {
		return personService.CreatePerson(person);
	}

	

}
