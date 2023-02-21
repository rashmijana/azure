package com.azure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azure.DAO.DockerDAO;
import com.azure.model.Model;

@Service
public class DockerServiceImpl implements DockerService {
	
	@Autowired
	public DockerDAO dockerDAO;

	@Override
	public List<Model> getModel() {
		return this.dockerDAO.findAll();
	}

	@Override
	public Model addModel(Model model) {
		this.dockerDAO.save(model);
		return model;
	}

	@Override
	public Model updateModel(Model model) {
		this.dockerDAO.save(model);
		return model;
	}

	@Override
	public void deleteModel(int roll) {
		Model model=this.dockerDAO.getOne(roll);
		this.dockerDAO.delete(model);
	}

}
