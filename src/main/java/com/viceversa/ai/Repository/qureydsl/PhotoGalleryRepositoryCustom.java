package com.viceversa.ai.Repository.qureydsl;

import com.viceversa.ai.Dto.PhotoGalleryDto;

import java.util.List;

public interface PhotoGalleryRepositoryCustom {

    List<PhotoGalleryDto> findAll(
            String galTitle
    );
}
