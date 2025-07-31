package com.project.gupshup.service.impl;

import com.project.gupshup.model.Reply;
import com.project.gupshup.model.Thought;
import com.project.gupshup.repository.IReplyRepository;
import com.project.gupshup.repository.IThoughtRepository;
import com.project.gupshup.service.IReplyService;
import org.springframework.stereotype.Service;

@Service
public class ReplyServiceImpl implements IReplyService {

    private final IReplyRepository replyRepository;
    private final IThoughtRepository thoughtRepository;

    public ReplyServiceImpl(IReplyRepository replyRepository,
                            IThoughtRepository thoughtRepository) {
        this.replyRepository = replyRepository;
        this.thoughtRepository = thoughtRepository;
    }

    @Override
    public Reply generateReply(Thought thought) {
        // Will be filled in Day 2 with OpenAI logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Reply saveManualReply(Long thoughtId, String content) {
        Thought thought = thoughtRepository.findById(thoughtId)
                .orElseThrow(() -> new RuntimeException("Thought not found"));

        Reply reply = Reply.builder()
                .thought(thought)
                .aiResponse(content)
                .build();

        return replyRepository.save(reply);
    }

    @Override
    public Reply getReplyByThoughtId(Long thoughtId) {
        return replyRepository.findAll().stream()
                .filter(r -> r.getThought().getId().equals(thoughtId))
                .findFirst()
                .orElse(null);
    }
}