package com.azure.service;

import java.util.List;

import com.azure.model.Model;

public interface DockerService {
	public List<Model> getModel();
	
	public Model addModel(Model model);

	public Model updateModel(Model model);

	public void deleteModel(int roll);

}
