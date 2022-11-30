package com.example.buildingarestfulwebservice;

public class Greeting {
    //fields
    private final long id;
    private final String content;

    //constructor
    public Greeting (long id, String content){
        this.id = id;
        this.content = content;
    }

    //accessors
    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
