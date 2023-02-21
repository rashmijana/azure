package com.azure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.azure.model.Model;
import com.azure.service.DockerService;

@RestController
public class MyController {
	
	@Autowired
	private DockerService dockerService;
	
	@GetMapping("/getModel")
	public List<Model> getModel(){
		return this.dockerService.getModel();
	}
	
	public Model addModel(@RequestBody Model model) {
		return this.dockerService.addModel(model);
	}
	
	public Model updateModel(@RequestBody Model model) {
		return this.dockerService.updateModel(model);
	}
	
	@DeleteMapping("books/{roll}")
	public ResponseEntity<HttpStatus> deleteModel(@PathVariable int roll){
		try {
			this.dockerService.deleteModel(roll);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
