package com.project.gupshup.dto;

import com.project.gupshup.model.Reply;
import com.project.gupshup.model.Suggestion;
import com.project.gupshup.model.Thought;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ThoughtDetailsResponse {
    private Thought thought;
    private Reply reply;
    private List<Suggestion> suggestions;
}