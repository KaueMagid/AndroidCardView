package com.kauemagid.cardview.models;

import java.util.Date;

public class Post {
    private String username;
    private String description;
    //private Date datePost;
    private int image;

    public Post() {
    }

    public Post(String username, String description, int image) {
        this.username = username;
        this.description = description;
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
