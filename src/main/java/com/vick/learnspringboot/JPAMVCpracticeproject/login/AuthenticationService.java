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
		for (Volunteer volunteer : volunteers) {
			if (volunteer.getName() == name && 
					volunteer.getSurname() == surname && 
					volunteer.getPassword() == password) {
				return true;
			}
		}
		return false;
	}
}
