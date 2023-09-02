package com.viceversa.ai.Repository.qureydsl;

import com.viceversa.ai.Dto.PhotoGalleryDto;
import com.viceversa.ai.entity.PhotoGallery;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class PhotoGalleryRepositoryCustomImpl extends QuerydslRepositorySupport implements PhotoGalleryRepositoryCustom {

    public PhotoGalleryRepositoryCustomImpl() {super(PhotoGallery.class);}


    @Override
    public List<PhotoGalleryDto> findAll(
            String galTitle,
            String galCreatedTime,
            String galModifiedTime
    ) {
        return null;
    }

}
