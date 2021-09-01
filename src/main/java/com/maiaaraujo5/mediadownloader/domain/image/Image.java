package com.maiaaraujo5.mediadownloader.domain.image;

import lombok.Getter;

@Getter
public class Image {

    private final String Name;
    private final String URL;

    public Image(String name, String URL) {
        this.Name = name;
        this.URL = URL;
    }
}