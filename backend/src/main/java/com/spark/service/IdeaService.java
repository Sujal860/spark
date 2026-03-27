package com.spark.service;

import com.spark.entity.Idea;
import com.spark.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdeaService {

    @Autowired
    private IdeaRepository ideaRepository;

    public Idea saveIdea(Idea idea) {
        return ideaRepository.save(idea);
    }

    public List<Idea> getAllIdeas() {
        return ideaRepository.findAll();
    }

    public Idea getIdeaById(Integer id) {
        return ideaRepository.findById(id).orElse(null);
    }

    public void deleteIdea(Integer id) {
        ideaRepository.deleteById(id);
    }
}