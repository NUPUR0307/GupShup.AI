package com.project.gupshup.service.impl;

import com.project.gupshup.model.Thought;
import com.project.gupshup.repository.IThoughtRepository;
import com.project.gupshup.service.IThoughtService;
import org.springframework.stereotype.Service;

@Service
public class ThoughtServiceImpl implements IThoughtService {

    private final IThoughtRepository thoughtRepository;

    public ThoughtServiceImpl(IThoughtRepository thoughtRepository) {
        this.thoughtRepository = thoughtRepository;
    }

    @Override
    public Thought saveAnonymousThought(String content) {
        Thought thought = Thought.builder()
                .content(content)
                .isPublic(false)
                .build();

        return thoughtRepository.save(thought);
    }

    @Override
    public Thought getThoughtById(Long id) {
        return thoughtRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Thought not found"));
    }
}
