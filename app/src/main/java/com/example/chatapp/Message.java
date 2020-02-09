package com.example.chatapp;

public class Message {

    private String name;
    private String text;
    private String imageUrl="";

    public Message(){
    }

    public Message(String name, String text) {
        this.name = name;
        this.text = text;
        this.imageUrl="";
    }

    public Message(String name, String text, String imageUrl){
        this.name = name;
        this.text = text;
        this.imageUrl = imageUrl;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
