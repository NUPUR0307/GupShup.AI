package com.project.gupshup.controller;

import com.project.gupshup.dto.ThoughtDetailsResponse;
import com.project.gupshup.model.Reply;
import com.project.gupshup.model.Suggestion;
import com.project.gupshup.model.Thought;
import com.project.gupshup.service.IReplyService;
import com.project.gupshup.service.ISuggestionService;
import com.project.gupshup.service.IThoughtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/thoughts")
public class ThoughtController {

    private final IThoughtService thoughtService;
    private final IReplyService replyService;
    private final ISuggestionService suggestionService;

    public ThoughtController(IThoughtService thoughtService,
                             IReplyService replyService,
                             ISuggestionService suggestionService) {
        this.thoughtService = thoughtService;
        this.replyService = replyService;
        this.suggestionService = suggestionService;
    }

    @PostMapping
    public ResponseEntity<Thought> submitThought(@RequestBody String content) {
        Thought saved = thoughtService.saveAnonymousThought(content);
        return ResponseEntity.ok(saved);
    }

    @GetMapping("/{id}/details")
    public ResponseEntity<ThoughtDetailsResponse> getThoughtDetails(@PathVariable Long id) {
        Thought thought = thoughtService.getThoughtById(id);
        Reply reply = replyService.getReplyByThoughtId(id);
        List<Suggestion> suggestions = suggestionService.getSuggestionsForThought(id);

        ThoughtDetailsResponse response = ThoughtDetailsResponse.builder()
                .thought(thought)
                .reply(reply)
                .suggestions(suggestions)
                .build();

        return ResponseEntity.ok(response);
    }
}