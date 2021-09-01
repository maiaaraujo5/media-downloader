package com.maiaaraujo5.mediadownloader.service.images;

import com.maiaaraujo5.mediadownloader.domain.image.Image;

import java.util.List;

public interface ImagesService {
    List<Image> save (List<Image> images) throws Exception;
}
