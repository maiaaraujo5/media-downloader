package com.maiaaraujo5.mediadownloader.controller.images.request;

import lombok.Getter;

@Getter
public class ImageRequest {

    private final String Name;
    private final String URL;

    public ImageRequest(String name, String URL) {
        this.Name = name;
        this.URL = URL;
    }
}