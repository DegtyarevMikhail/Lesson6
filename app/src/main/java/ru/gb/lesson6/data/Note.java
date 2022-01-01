package ru.gb.lesson6.data;
import android.content.Intent;

import java.io.Serializable;

public class Note implements Serializable {
    private Integer id;
    private String title;
    private String description;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscription() {
        return description;
    }

    public void setDiscription(String discription) {
        this.description = discription;
    }
}
