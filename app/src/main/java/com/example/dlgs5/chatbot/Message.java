package com.example.dlgs5.chatbot;

public class Message {
    private int type;
    private String time;
    private String content;

    public Message(int type, String time, String content){
        this.type = type;
        this.time = time;
        this.content = content;
    }
    public int getType() {return type;}
    public String getTime() {return time;}
    public String getContent() {return content;}
}
