package com.project.gupshup.service;

import com.project.gupshup.model.Reply;
import com.project.gupshup.model.Thought;

public interface IReplyService {
    Reply generateReply(Thought thought); // actual GPT reply
    Reply saveManualReply(Long thoughtId, String content); // optional for testing
    Reply getReplyByThoughtId(Long thoughtId);
}