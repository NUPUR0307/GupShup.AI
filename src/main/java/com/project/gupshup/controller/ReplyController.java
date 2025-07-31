package com.project.gupshup.controller;

import com.project.gupshup.model.Reply;
import com.project.gupshup.service.IReplyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/replies")
public class ReplyController {

    private final IReplyService replyService;

    public ReplyController(IReplyService replyService) {
        this.replyService = replyService;
    }

    @PostMapping("/{thoughtId}")
    public ResponseEntity<Reply> saveManualReply(
            @PathVariable Long thoughtId,
            @RequestBody String content) {
        return ResponseEntity.ok(replyService.saveManualReply(thoughtId, content));
    }
}