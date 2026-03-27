package com.spark.controller;

import com.spark.entity.Idea;
import com.spark.service.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ideas")
public class IdeaController {

    @Autowired
    private IdeaService ideaService;

    @PostMapping
    public Idea createIdea(@RequestBody Idea idea) {
        return ideaService.saveIdea(idea);
    }

    @GetMapping
    public List<Idea> getAllIdeas() {
        return ideaService.getAllIdeas();
    }

    @GetMapping("/{id}")
    public Idea getIdea(@PathVariable Integer id) {
        return ideaService.getIdeaById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteIdea(@PathVariable Integer id) {
        ideaService.deleteIdea(id);
    }
}