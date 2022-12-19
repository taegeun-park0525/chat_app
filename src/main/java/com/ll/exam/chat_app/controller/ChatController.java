package com.ll.exam.chat_app.controller;

import com.ll.exam.chat_app.ChatMessage;
import com.ll.exam.chat_app.RsData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {
    private List<ChatMessage> chatMessages = new ArrayList<>();


    @AllArgsConstructor
    @Getter
    public static class writeMessageResponse {
        private final Long id;
    }

    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData writeMessage() {
        ChatMessage message = new ChatMessage("박태근", "안녕하세요");

        chatMessages.add(message);

        return new RsData(
                "S-1",
                "메세지가 작성되었습니다",
                message
        );
    }
}
