package com.vick.learnspringboot.JPAMVCpracticeproject.data.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vick.learnspringboot.JPAMVCpracticeproject.data.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
	List<Project> findByName(String name);
}
