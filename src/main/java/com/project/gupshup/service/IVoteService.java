package com.project.gupshup.service;

import com.project.gupshup.model.Vote;

public interface IVoteService {
    Vote castVote(Long thoughtId, boolean isUpvote);
}