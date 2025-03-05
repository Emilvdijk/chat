package nl.emilvdijk.chat;

import lombok.Data;

@Data
public class ChatMessage {
  private String timestamp;
  private String sender;
  private String content;
}
