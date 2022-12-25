package com.vick.learnspringboot.JPAMVCpracticeproject.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vick.learnspringboot.JPAMVCpracticeproject.data.repos.ProjectRepository;
import com.vick.learnspringboot.JPAMVCpracticeproject.data.repos.VolunteerRepository;

@Component 
public class DataCommandLineRunner implements CommandLineRunner{
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private VolunteerRepository volunteerRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		projectRepository.save(new Project(1, "Social Networks"));
		projectRepository.save(new Project(2, "Ri-generazioni Cascina"));
		projectRepository.save(new Project(3, "Ri-generazioni Putignano"));
		System.out.println(projectRepository.findAll());
		Project socialNetworks = projectRepository.findById(1l).get();
		volunteerRepository.save(new Volunteer(1, "Vic", "Sx", socialNetworks));
		volunteerRepository.save(new Volunteer(2, "Mau", "Tzerom", socialNetworks));
		Project cascina = projectRepository.findByName("Ri-generazioni Cascina").get(0);
		volunteerRepository.save(new Volunteer(3, "Hermione", "Trepiani", cascina));
		volunteerRepository.save(new Volunteer(4, "Pino", "Pec", cascina));
		Project putignano = projectRepository.findByName("Ri-generazioni Putignano").get(0);	
		volunteerRepository.save(new Volunteer(5, "Vale", "Giu", putignano));
		volunteerRepository.save(new Volunteer(6, "Simo", "Cog", putignano));
		System.out.println(volunteerRepository.findAll());
	}

}
