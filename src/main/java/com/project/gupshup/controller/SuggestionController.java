package com.project.gupshup.controller;

import com.project.gupshup.model.Suggestion;
import com.project.gupshup.service.ISuggestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/suggestions")
public class SuggestionController {

    private final ISuggestionService suggestionService;

    public SuggestionController(ISuggestionService suggestionService) {
        this.suggestionService = suggestionService;
    }

    @PostMapping("/{thoughtId}")
    public ResponseEntity<Suggestion> addSuggestion(
            @PathVariable Long thoughtId,
            @RequestBody String content) {
        return ResponseEntity.ok(suggestionService.addSuggestion(thoughtId, content));
    }

    @GetMapping("/{thoughtId}")
    public ResponseEntity<List<Suggestion>> getSuggestions(@PathVariable Long thoughtId) {
        return ResponseEntity.ok(suggestionService.getSuggestionsForThought(thoughtId));
    }
}