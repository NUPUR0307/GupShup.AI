package com.project.gupshup.repository;

import com.project.gupshup.model.Suggestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISuggestionRepository extends JpaRepository<Suggestion, Long> {
    List<Suggestion> findByThoughtId(Long thoughtId);
}