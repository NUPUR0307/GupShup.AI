package com.project.gupshup.controller;

import com.project.gupshup.model.Vote;
import com.project.gupshup.service.IVoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/votes")
public class VoteController {

    private final IVoteService voteService;

    public VoteController(IVoteService voteService) {
        this.voteService = voteService;
    }

    @PostMapping("/{thoughtId}")
    public ResponseEntity<Vote> castVote(
            @PathVariable Long thoughtId,
            @RequestParam boolean isUpvote) {
        return ResponseEntity.ok(voteService.castVote(thoughtId, isUpvote));
    }
}