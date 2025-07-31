package com.project.gupshup.repository;

import com.project.gupshup.model.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReplyRepository extends JpaRepository<Reply, Long> {
    // You can add custom query methods later if needed
}