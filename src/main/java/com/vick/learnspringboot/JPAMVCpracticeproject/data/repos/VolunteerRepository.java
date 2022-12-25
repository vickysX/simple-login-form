package com.vick.learnspringboot.JPAMVCpracticeproject.data.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vick.learnspringboot.JPAMVCpracticeproject.data.Volunteer;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer, Long>{

}
