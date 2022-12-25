package com.vick.learnspringboot.JPAMVCpracticeproject.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vick.learnspringboot.JPAMVCpracticeproject.data.Volunteer;
import com.vick.learnspringboot.JPAMVCpracticeproject.data.repos.VolunteerRepository;

@Service
public class AuthenticationService {
	@Autowired
	private VolunteerRepository volunteerRepository;
	
	public boolean authenticate(String name, String surname, String password) {
		List<Volunteer> volunteers = volunteerRepository.findAll();	
		return volunteers.stream()
				.anyMatch(vol -> vol.getName().equalsIgnoreCase(name) && 
				vol.getSurname().equalsIgnoreCase(surname) && 
				vol.getPassword().equals(password));

	}
}
