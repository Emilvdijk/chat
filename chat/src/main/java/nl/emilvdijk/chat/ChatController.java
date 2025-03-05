package nl.emilvdijk.chat;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ChatController {
  @MessageMapping("/sendMessage")
  @SendTo("/topic/messages")
  public ChatMessage sendMessage(ChatMessage message) {
    message.setTimestamp(java.time.LocalTime.now().toString());
    log.debug("message send : {}", message);
    log.info("{}: {}", message.getSender(), message.getContent());
    return message;
  }

  @GetMapping("/")
  public String home() {
    return "chat.html";
  }
}
