package com.project.gupshup.repository;

import com.project.gupshup.model.Thought;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IThoughtRepository extends JpaRepository<Thought, Long> {
    // Custom methods (if needed) go here
}