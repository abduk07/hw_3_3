package com.example.hw_3_3;

import android.widget.ImageView;

public class Contact {
    private int image;
    private String name;
    private String surname;

    public Contact(int image, String name, String surname) {
        this.image = image;
        this.name = name;
        this.surname = surname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
