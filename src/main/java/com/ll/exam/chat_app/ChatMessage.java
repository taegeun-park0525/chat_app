package com.ll.exam.chat_app;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;


@AllArgsConstructor
@Getter
public class ChatMessage {
    private Long id;
    private LocalDateTime createDate;
    private String authorName;
    private String content;

    public ChatMessage(String authorName, String content) {
        this(1L, LocalDateTime.now(), authorName, content);
    }
}
