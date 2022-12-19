package com.ll.exam.chat_app.controller;

import com.ll.exam.chat_app.ChatMessage;
import com.ll.exam.chat_app.RsData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/chat")
public class ChatController {
    ChatMessage message = new ChatMessage("홍길동", "안녕하세요");
    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData writeMessage() {
        return new RsData(
                "S-1",
                "메세지가 작성되었습니다",
                message
        );
    }
}
