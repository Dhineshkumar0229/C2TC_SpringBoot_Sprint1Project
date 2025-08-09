package com.tnsif.mallservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.mallservice.entity.Mall;
import com.tnsif.mallservice.repository.MallRepository;


@Service
public class MallService {
	@Autowired
    private MallRepository repo;

    // Get all records
    public List<Mall> listAll() {
        return repo.findAll();
    }

    // Save or update a record
    public Mall save(Mall mall) {
        return repo.save(mall);
    }

    // Get by ID
    public Mall get(String generalManagerId) {
        return repo.findById(generalManagerId).orElse(null);
    }

    // Delete by ID
    public void delete(String generalManagerId) {
        repo.deleteById(generalManagerId);
    }
}