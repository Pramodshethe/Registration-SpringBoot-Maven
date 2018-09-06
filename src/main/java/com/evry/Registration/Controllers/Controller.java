package com.evry.Registration.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.evry.Registration.Model.Student;
import com.evry.Registration.Repositories.Repository;



@RestController
@RequestMapping("/api/v1/std")
public class Controller {
	
	@Autowired
	private Repository repository; 
		
	
	@GetMapping
	public List<Student> list(){
		return repository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Student student) {
		repository.save(student);
	}
	
	@GetMapping("/{id}")
	public Optional<Student> get(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}
