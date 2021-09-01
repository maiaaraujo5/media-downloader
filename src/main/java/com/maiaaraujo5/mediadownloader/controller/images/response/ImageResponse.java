package com.maiaaraujo5.mediadownloader.controller.images.response;

import lombok.Getter;

@Getter
public class ImageResponse {
    private final String Name;
    private final String URL;

    public ImageResponse(String name, String URL) {
        this.Name = name;
        this.URL = URL;
    }
}
