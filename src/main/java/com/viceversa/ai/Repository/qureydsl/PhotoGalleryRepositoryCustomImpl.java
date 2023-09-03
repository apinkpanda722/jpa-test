package com.viceversa.ai.Repository.qureydsl;

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
    public Page<PhotoGalleryDto> findAll(
            String galTitle,
            Pageable pageable
    ) {
        JPQLQuery<PhotoGalleryDto> query = from(photoGallery)
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
                );

        List<PhotoGalleryDto> photoGalleryList = Optional.ofNullable(getQuerydsl())
                .orElseThrow(() -> new IllegalArgumentException("Spring Data JPA로부터 QueryDsl 인스턴스를 못 가져옴"))
                .applyPagination(pageable, query)
                .fetch();

        return new PageImpl<>(photoGalleryList, pageable, query.fetchCount());
    }

    private BooleanExpression eqGalTitle(String galTitle) {
        if (galTitle == null || galTitle.isEmpty())
            return null;
        return photoGallery.galTitle.eq(galTitle);
    }

}
