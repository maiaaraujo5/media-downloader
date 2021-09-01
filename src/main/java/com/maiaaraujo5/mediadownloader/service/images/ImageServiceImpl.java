package com.maiaaraujo5.mediadownloader.service.images;

import com.maiaaraujo5.mediadownloader.domain.image.Image;
import com.maiaaraujo5.mediadownloader.repository.ImageRepository;
import com.maiaaraujo5.mediadownloader.repository.ImageRepositoryImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ImageServiceImpl implements ImagesService{

    private final ImageRepository imageRepository;

    @Autowired
    public ImageServiceImpl (ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public List<Image> save(List<Image> images) throws Exception {
        log.info("saving images");

        imageRepository.Save(images);

        return images;
    }
}
