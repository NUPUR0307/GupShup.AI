package com.project.gupshup.service;

import com.project.gupshup.model.Thought;

public interface IThoughtService {
    Thought saveAnonymousThought(String content);
    Thought getThoughtById(Long id);
}