package com.firstapi.officemanagement.people;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeopleService {
    
	private final PeopleRepository peopleRepository;

	@Autowired
    public PeopleService(PeopleRepository peopleRepository) {
		this.peopleRepository = peopleRepository;
	}

	public List<People> getPeople(){
		return peopleRepository.findAll();
	} 
}