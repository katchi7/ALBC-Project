package com.twitter.directmessaging.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {


        private String id;
        private Chat chat;
        private User sender;
        private String content;
        private Date timestamp;

}
