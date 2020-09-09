package com.ayrton.gerenpersoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ayrton.gerenpersoapi.dto.response.MessageResponseDTO;
import com.ayrton.gerenpersoapi.entity.Person;
import com.ayrton.gerenpersoapi.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}


	public MessageResponseDTO CreatePerson(Person person) {
		Person savedPerson = personRepository.save(person);
		return MessageResponseDTO.
				builder()
				.message("Created person with id " + savedPerson.getId())
				.build();

	}

}