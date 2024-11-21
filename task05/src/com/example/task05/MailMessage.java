package com.example.task05;

import java.lang.ref.SoftReference;

public class MailMessage extends TypeOfMessage<String>{
    private final String from;
    private final String to;
    private final String content;

    public MailMessage(String from, String to, String content){
        super(from,to,content);
        this.from = from;
        this.to = to;
        this.content = content;
    }


    public String getContent() {
        return content;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
}
