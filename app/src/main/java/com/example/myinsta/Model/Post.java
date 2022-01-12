package com.example.myinsta.Model;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("description")
    private String description;
    @SerializedName("imageurl")
    private String imageurl;
    @SerializedName("postid")
    private String id;
    @SerializedName("publisher")
    private String pub;

    public Post()
    {

    }
    public Post(String description, String imageurl, String postid, String publisher) {
        this.description = description;
        this.imageurl = imageurl;
        this.id = postid;
        this.pub = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getPostid() {
        return id;
    }

    public void setPostid(String postid) {
        this.id = postid;
    }

    public String getPublisher() {
        return pub;
    }

    public void setPublisher(String publisher) {
        this.pub = publisher;
    }
}
