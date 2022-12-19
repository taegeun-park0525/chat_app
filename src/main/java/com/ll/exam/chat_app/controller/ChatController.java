package com.ll.exam.chat_app.controller;

import com.ll.exam.chat_app.domain.ChatMessage;
import com.ll.exam.chat_app.domain.RsData;
import com.ll.exam.chat_app.domain.dto.WriteMessageRequest;
import com.ll.exam.chat_app.domain.dto.WriteMessageResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {
    private List<ChatMessage> chatMessages = new ArrayList<>();

    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData<WriteMessageResponse> writeMessage(@RequestBody WriteMessageRequest req) {
        ChatMessage message = new ChatMessage(req.authorName(), req.content());
        chatMessages.add(message);
        return new RsData<>(
                "S-1",
                "메세지가 작성되었습니다.",
                new WriteMessageResponse(message.getId())
        );
    }

    @GetMapping("/messages")
    @ResponseBody
    public RsData<List<ChatMessage>> messages() {
        return new RsData<>(
                "S-1",
                "성공",
                chatMessages
        );
    }
}
