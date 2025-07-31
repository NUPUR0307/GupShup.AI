package com.project.gupshup.repository;

import com.project.gupshup.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVoteRepository extends JpaRepository<Vote, Long> {
    // You can add methods like: findByThoughtId, countByThoughtId, etc. later
}