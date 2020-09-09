package com.ayrton.gerenpersoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayrton.gerenpersoapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
