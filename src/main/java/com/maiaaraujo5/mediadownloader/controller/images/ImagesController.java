package com.maiaaraujo5.mediadownloader.controller.images;

import com.maiaaraujo5.mediadownloader.controller.images.request.ImageRequest;
import com.maiaaraujo5.mediadownloader.controller.images.response.ImageResponse;
import com.maiaaraujo5.mediadownloader.domain.image.Image;
import com.maiaaraujo5.mediadownloader.service.images.ImagesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/images")
public class ImagesController {

    private final ImagesService imagesService;

    @Autowired
    public ImagesController(ImagesService imagesService) {
        this.imagesService = imagesService;
    }

    @PostMapping
    public ResponseEntity<List<ImageResponse>> SaveImage(@RequestBody List<ImageRequest> imageRequests) throws Exception {
        log.info("Receiving request");

        List<Image> images = new ArrayList<>();

        imageRequests.forEach(image -> {
            images.add(new Image(image.getName(), image.getURL()));
        });

        List<Image> savedImages = imagesService.save(images);

        List<ImageResponse> response = new ArrayList<>();

        savedImages.forEach(image -> {
            response.add(new ImageResponse(image.getName(), image.getURL()));
        });

        return ResponseEntity.ok(response);
    }
}
