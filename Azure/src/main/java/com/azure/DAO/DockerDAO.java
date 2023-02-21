package com.azure.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.azure.model.Model;

public interface DockerDAO extends JpaRepository<Model, Integer>  {

}
