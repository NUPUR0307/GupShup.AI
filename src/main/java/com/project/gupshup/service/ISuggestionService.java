package com.project.gupshup.service;

import com.project.gupshup.model.Suggestion;

import java.util.List;

public interface ISuggestionService {
    Suggestion addSuggestion(Long thoughtId, String content);
    List<Suggestion> getSuggestionsForThought(Long thoughtId);
}