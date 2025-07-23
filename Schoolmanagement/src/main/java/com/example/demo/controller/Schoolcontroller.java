package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Schoolentity;
import com.example.demo.repository.Schoolrepository;

@RestController
public class Schoolcontroller {
	
@Autowired
private Schoolrepository repo;

@PostMapping("/addschool")
public Schoolentity addschool(@RequestBody Schoolentity shl) {
	try {
		repo.save(shl);
		return shl;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;

}

@PutMapping("/updateschool")
public Schoolentity updateschool(@RequestBody Schoolentity shl) {
	try {
		repo.save(shl);
		return shl;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;

}

@GetMapping("/getschool")
public List<Schoolentity> getschool() {
	try {
		
		return repo.findAll();
	} catch (Exception e) {
		e.printStackTrace();
	}
	return null;
}

@DeleteMapping("/Deleteschool/{Id}")
public String deleteschool(@PathVariable int Id)  {
	try {
		Schoolentity shl = repo.getOne(Id);
		repo.delete(shl);
		return "Deleted Successfully";
}catch(Exception e) {
	e.printStackTrace();
}
	return null;
}
@GetMapping("/getone/{Id}")
public Optional<Schoolentity> Getoneid(@PathVariable int Id){
	try {
		return repo.findById(Id);
	}catch(Exception e){
		e.printStackTrace();
	}
	return null;
}
}

