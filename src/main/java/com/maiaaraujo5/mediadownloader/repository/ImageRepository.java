package com.maiaaraujo5.mediadownloader.repository;

import com.maiaaraujo5.mediadownloader.domain.image.Image;

import java.util.List;

public interface ImageRepository {

    void Save(List<Image> images);
}
