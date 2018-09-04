package com.evry.Registration.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evry.Registration.Model.Student;

public interface Repository extends JpaRepository<Student, Long>{

}
