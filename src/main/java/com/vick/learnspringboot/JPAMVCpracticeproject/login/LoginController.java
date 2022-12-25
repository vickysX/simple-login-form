package com.vick.learnspringboot.JPAMVCpracticeproject.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vick.learnspringboot.JPAMVCpracticeproject.data.repos.VolunteerRepository;

@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	private VolunteerRepository volunteerRepository;
	
	public LoginController(
			AuthenticationService authenticationService,
			VolunteerRepository volunteerRepository) {
		super();
		this.authenticationService = authenticationService;
		this.volunteerRepository = volunteerRepository;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(
			@RequestParam String name,
			@RequestParam String surname,
			@RequestParam String password,
			ModelMap model
			) {
		if (authenticationService.authenticate(name, surname, password)) {
			model.put("name", name);
			model.put("surname", surname);
			model.put("password", password);
			model.put(
					"project", 
					volunteerRepository.findAll().stream()
					.filter(vol -> vol.getName().equals(name) && 
							vol.getSurname().equals(surname) && 
							vol.getPassword().equals(password))
					.toList().get(0).getProject().getName());
			return "welcome";
		}
		model.put("errorMessage", "CREDENZIALI ERRATE, RIPROVA");
		return "login";
		
	}
}
