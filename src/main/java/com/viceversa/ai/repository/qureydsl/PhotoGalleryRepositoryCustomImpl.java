package com.viceversa.ai.repository.qureydsl;

import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.JPQLQuery;
import com.viceversa.ai.dto.PhotoGalleryDto;
import com.viceversa.ai.entity.PhotoGallery;
import com.viceversa.ai.entity.QPhotoGallery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;
import java.util.Optional;

public class PhotoGalleryRepositoryCustomImpl extends QuerydslRepositorySupport implements PhotoGalleryRepositoryCustom {

    public PhotoGalleryRepositoryCustomImpl() {super(PhotoGallery.class);}

    QPhotoGallery photoGallery = QPhotoGallery.photoGallery;

    @Override
    public List<PhotoGalleryDto> findAll(
            String galTitle
    ) {
        return from(photoGallery)
                .select(Projections.constructor(
                        PhotoGalleryDto.class,
                        photoGallery.galContentId,
                        photoGallery.galContentTypeId,
                        photoGallery.galTitle,
                        photoGallery.galWebImageUrl,
                        photoGallery.galCreatedTime,
                        photoGallery.galModifiedTime,
                        photoGallery.galPhotographyMonth,
                        photoGallery.galPhotographyLocation,
                        photoGallery.galPhotographer,
                        photoGallery.galSearchKeyword
                ))
                .where(eqGalTitle(galTitle))
                .orderBy(
                        photoGallery.galContentId.asc()
                )
                .fetch();
    }

    private BooleanExpression eqGalTitle(String galTitle) {
        if (galTitle == null || galTitle.isEmpty())
            return null;
        return photoGallery.galTitle.eq(galTitle);
    }

}
