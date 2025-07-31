package com.project.gupshup.service.impl;

import com.project.gupshup.model.Suggestion;
import com.project.gupshup.model.Thought;
import com.project.gupshup.repository.IThoughtRepository;
import com.project.gupshup.repository.ISuggestionRepository;
import com.project.gupshup.service.ISuggestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionServiceImpl implements ISuggestionService {

    private final ISuggestionRepository suggestionRepository;
    private final IThoughtRepository thoughtRepository;

    public SuggestionServiceImpl(ISuggestionRepository suggestionRepository,
                                 IThoughtRepository thoughtRepository) {
        this.suggestionRepository = suggestionRepository;
        this.thoughtRepository = thoughtRepository;
    }

    @Override
    public Suggestion addSuggestion(Long thoughtId, String content) {
        Thought thought = thoughtRepository.findById(thoughtId)
                .orElseThrow(() -> new RuntimeException("Thought not found"));

        Suggestion suggestion = Suggestion.builder()
                .thought(thought)
                .content(content)
                .build();

        return suggestionRepository.save(suggestion);
    }

    @Override
    public List<Suggestion> getSuggestionsForThought(Long thoughtId) {
        return suggestionRepository.findByThoughtId(thoughtId);
    }
}