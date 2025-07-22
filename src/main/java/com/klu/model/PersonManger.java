package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.repository.personRepository;

@Service
public class PersonManger {
	
	@Autowired
	personRepository pr;
	
	public String getname(int pass,String name)
	{
		return pr.getid(pass, name);
	}

}
