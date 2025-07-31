package com.project.gupshup.service.impl;

import com.project.gupshup.model.Vote;
import com.project.gupshup.repository.IVoteRepository;
import com.project.gupshup.service.IVoteService;
import org.springframework.stereotype.Service;

@Service
public class VoteServiceImpl implements IVoteService {

    private final IVoteRepository voteRepository;

    public VoteServiceImpl(IVoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public Vote castVote(Long thoughtId, boolean isUpvote) {
        Vote vote = Vote.builder()
                .thoughtId(thoughtId)
                .isUpvote(isUpvote)
                .build();

        return voteRepository.save(vote);
    }
}