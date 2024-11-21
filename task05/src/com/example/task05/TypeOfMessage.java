package com.example.task05;

public abstract class TypeOfMessage<T> {
    private String from;
    private String to;
    private T content;

    protected TypeOfMessage(String from, String to, T salary) {
        this.from = from;
        this.to = to;
        this.content = salary;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }
    public T getContent() {
        return content;
    }


}
