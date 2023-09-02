package com.viceversa.ai.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPhotoGallery is a Querydsl query type for PhotoGallery
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPhotoGallery extends EntityPathBase<PhotoGallery> {

    private static final long serialVersionUID = -512384188L;

    public static final QPhotoGallery photoGallery = new QPhotoGallery("photoGallery");

    public final StringPath galContentId = createString("galContentId");

    public final StringPath galContentTypeId = createString("galContentTypeId");

    public final StringPath galCreatedTime = createString("galCreatedTime");

    public final StringPath galModifiedTime = createString("galModifiedTime");

    public final StringPath galPhotographer = createString("galPhotographer");

    public final StringPath galPhotographyLocation = createString("galPhotographyLocation");

    public final StringPath galPhotographyMonth = createString("galPhotographyMonth");

    public final StringPath galSearchKeyword = createString("galSearchKeyword");

    public final StringPath galTitle = createString("galTitle");

    public final StringPath galWebImageUrl = createString("galWebImageUrl");

    public QPhotoGallery(String variable) {
        super(PhotoGallery.class, forVariable(variable));
    }

    public QPhotoGallery(Path<? extends PhotoGallery> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPhotoGallery(PathMetadata metadata) {
        super(PhotoGallery.class, metadata);
    }

}

