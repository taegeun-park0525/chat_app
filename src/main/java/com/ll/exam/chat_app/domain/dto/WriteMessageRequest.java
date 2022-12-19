package com.ll.exam.chat_app.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WriteMessageRequest {
    private String authorName;
    private String content;

}